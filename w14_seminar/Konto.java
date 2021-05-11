public class Konto {
        private double kontojaak;
        private int number;

    public Konto(int number) {
      this.number = number;
   }

    public void rahasisse(double kogus) {
        kontojaak += kogus;
    }

    public void rahavalja(double kogus) throws rahapuuduException {
        if (kogus <= kontojaak) {
            kontojaak -= kogus;
        } else {
            double puudujaak = kogus - kontojaak;
            throw new rahapuuduException(puudujaak);
        }
    }

    public static void main(String[] args) {
        Konto k = new Konto(12065);
        k.rahasisse(600);
        try {
            System.out.println("\nTest1");
            k.rahavalja(100.00);
            System.out.println("\nTest2");
            k.rahavalja(600.00);
        } catch (rahapuuduException e) {
            System.out.println("Puudu jääb " + e.getKogus() + "eurot.");
            e.printStackTrace();
        }
    }
}
