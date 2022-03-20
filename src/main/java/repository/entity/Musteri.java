package repository.entity;

public class Musteri {
    long id;
    String ad;
    String soyad;
    String tcKimlik;
    String firmaAdi;
    String vergiNumarasi;
    String vergiDairesi;
    String adres;
    String profilePhoto;
    String telefon;
    String email;
    double borcLimiti;
    boolean musteriTipi;
    int state;

    public Musteri() {
    }

    public Musteri(long id, String ad, String soyad, String tcKimlik, String firmaAdi,
                   String vergiNumarasi, String vergiDairesi, String adres,
                   String profilePhoto, String telefon, String email,
                   double borcLimiti, boolean musteriTipi, int state) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.tcKimlik = tcKimlik;
        this.firmaAdi = firmaAdi;
        this.vergiNumarasi = vergiNumarasi;
        this.vergiDairesi = vergiDairesi;
        this.adres = adres;
        this.profilePhoto = profilePhoto;
        this.telefon = telefon;
        this.email = email;
        this.borcLimiti = borcLimiti;
        this.musteriTipi = musteriTipi;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Musteri{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", tcKimlik='" + tcKimlik + '\'' +
                ", firmaAdi='" + firmaAdi + '\'' +
                ", vergiNumarasi='" + vergiNumarasi + '\'' +
                ", vergiDairesi='" + vergiDairesi + '\'' +
                ", adres='" + adres + '\'' +
                ", profilePhoto='" + profilePhoto + '\'' +
                ", telefon='" + telefon + '\'' +
                ", email='" + email + '\'' +
                ", borcLimiti=" + borcLimiti +
                ", musteriTipi=" + musteriTipi +
                ", state=" + state +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getTcKimlik() {
        return tcKimlik;
    }

    public void setTcKimlik(String tcKimlik) {
        this.tcKimlik = tcKimlik;
    }

    public String getFirmaAdi() {
        return firmaAdi;
    }

    public void setFirmaAdi(String firmaAdi) {
        this.firmaAdi = firmaAdi;
    }

    public String getVergiNumarasi() {
        return vergiNumarasi;
    }

    public void setVergiNumarasi(String vergiNumarasi) {
        this.vergiNumarasi = vergiNumarasi;
    }

    public String getVergiDairesi() {
        return vergiDairesi;
    }

    public void setVergiDairesi(String vergiDairesi) {
        this.vergiDairesi = vergiDairesi;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBorcLimiti() {
        return borcLimiti;
    }

    public void setBorcLimiti(double borcLimiti) {
        this.borcLimiti = borcLimiti;
    }

    public boolean isMusteriTipi() {
        return musteriTipi;
    }

    public void setMusteriTipi(boolean musteriTipi) {
        this.musteriTipi = musteriTipi;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }



}
