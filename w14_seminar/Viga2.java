public class Viga2 {
    public static void main(String[] args) {
        String[] Numbrid = {"Üks","Kaks", "Kolm", "Neli", "Viis", "Kuus", "Seitse", "Kaheksa", "Üheksa", "Kümme"};
        try{
        for(int i = 1; i<= 10; i++) {
            System.out.println(Numbrid[i]);
        }}catch(Exception e){
            System.out.println("Viga numbri esitamisel");
        }
    }
}
