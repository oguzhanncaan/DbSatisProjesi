import controller.MusteriController;
import repository.entity.Musteri;
import service.MusteriService;

public class ProjectRunner {
    public static void main(String[] args) {
        MusteriController musteriController = new MusteriController();
        //musteriController.MusteriKaydet();
        MusteriService musteriService = new MusteriService();
        for (Musteri musteri : musteriService.findAll()){
            System.out.println("Müşteri id: " +musteri.getId());
            System.out.println("Müşteri ad: " +musteri.getAd());
            System.out.println("Müşteri soyad: " +musteri.getSoyad());
            System.out.println("----------------------------");

        }

    }
}
