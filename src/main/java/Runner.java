import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Runner {
    public static void main(String[] args) {

        try {
            // 1- Driver kullan
            Driver.class.forName("org.postgresql.Driver");
            // 2- Bağlantı yap
            /**
             * ConnectionString --> Her veritabanı için ayrı yazılır.
             * Bir veritabanı için connectionstring arayacaksınız.
             * Veritabanının kendi sitesine bakınız...
             */
            String URL = "jdbc:postgresql://localhost:5432/SatisDB";
            String username = "postgres";
            String password = "root";
            Connection connection = DriverManager.getConnection(URL, username, password);
            // 3- Emir ver
            String SQL = "insert into tblmusteri(ad, soyad) values ('Ayşe' , 'Yurdeşen')";
            PreparedStatement pst = connection.prepareCall(SQL);
            // 4- Emri işle
            pst.executeUpdate();
            // 5- Bağlantıyı kapat
            connection.close();
        } catch (Exception e){
            System.out.println("Hata: " +e);
        }



    }
}
