package repository;

import repository.entity.Musteri;
import utility.ConnectionDb;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class MusteriRepository {

    private ConnectionDb Db = new ConnectionDb();
    private PreparedStatement pst;

    public void save (Musteri musteri){
        String SQL = "insert into tblmusteri(ad,soyad,tckimlik, firmadi,verginumarasi,vergidairesi,adres,profilephoto,telefon,email,\n" +
                "borclimiti,musteritipi,state) values ('"+musteri.getAd()+
                "','"+musteri.getSoyad()+
                "','"+musteri.getTcKimlik()+
                "','"+musteri.getFirmaAdi()+
                "','"+musteri.getVergiNumarasi()+
                "','"+musteri.getVergiDairesi()+
                "','"+musteri.getAdres()+
                "','"+musteri.getProfilePhoto()+
                "','"+musteri.getTelefon()+
                "','"+musteri.getEmail()+
                "',"+musteri.getBorcLimiti()+","+musteri.isMusteriTipi()+",1)";

                 try{
                     pst = Db.getConnection().prepareCall(SQL);
                     pst.executeUpdate();
                     Db.closeConnection();
                 } catch (Exception e){
                     System.out.println("Hata: " +e);
                 }
        }

    public void update (Musteri musteri){

        String SQL = "update tblmusteri set " +
                "   ad = '"+musteri.getAd()+
                "', soyad = '"+musteri.getSoyad()+
                "', tckimlik = '"+musteri.getTcKimlik()+
                "', firmadi = '"+musteri.getFirmaAdi()+
                "', verginumarasi = '"+musteri.getVergiNumarasi()+
                "', vergidairesi = '"+musteri.getVergiDairesi()+
                "', adres = '"+musteri.getAdres()+
                "', profilephoto = '"+musteri.getProfilePhoto()+
                "', telefon = '"+musteri.getTelefon()+
                "', email = '"+musteri.getEmail()+
                "', borclimiti = "+musteri.getBorcLimiti()+
                " , musteritipi = "+musteri.isMusteriTipi()+
                " , state  = "+musteri.getState()+
                " where id = 0";
        try {
            pst = Db.getConnection().prepareCall(SQL);
            pst.executeUpdate();
            Db.closeConnection();
        } catch (Exception e){
            System.out.println("Müşteri Update Error: " +e.toString());
        }

    }

    public void delete (long id){
        String SQL = "delete from tblmusteri where id = "+id;
        try {
            pst = Db.getConnection().prepareCall(SQL);
            pst.executeUpdate();
            Db.closeConnection();
        } catch (Exception e){
            System.out.println("Müşteri Delete Error: " +e.toString());
        }
    }

    public List<Musteri> findAll(){

        List<Musteri> list = new ArrayList<>();
        String SQL = "select * from tblmusteri";
         try {
            pst= Db.getConnection().prepareCall(SQL);
             //pst.executeUpdate();
             /**
              * Select sonucunda dönen tablo  bize ResultSet olarak getirilir.
              */
             ResultSet rs = pst.executeQuery();
             // rs.next();
             while(rs.next()) {
                 String ad = rs.getString("ad");
                 String soyad = rs.getString("soyad");
                 String adres = rs.getString("adres");
                 String telefon = rs.getString("telefon");
                 Musteri mst = new Musteri();
                 mst.setId(rs.getLong("id"));
                 mst.setAd(ad);
                 mst.setSoyad(soyad);
                 mst.setAdres(adres);
                 mst.setTelefon(telefon);
                 list.add(mst);
             }
             Db.closeConnection();

         } catch (Exception e){
            System.out.println("Müşteri List Error: " +e.toString());
        }
        return list;
    }


}
