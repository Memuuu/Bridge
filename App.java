package Bridge;

public class App {
    public static void main(String[] args) throws Exception {
            
        System.out.println("Bridge");

        Rapor rapor1 = new PerformansRapor(new DOC());
        Rapor rapor2 = new CalisanRapor(new PDF());
        rapor1.goster();
        rapor2.goster();
        rapor1.setRapor(new PDF());
        rapor1.goster();

      
            
    }
}
   