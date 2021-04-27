public class Proov {
    public static void main(String[] args) {
        Jook l1=new Jook("vesi",0.2f,1.0f);
        Joogipudel l2 = new Joogipudel(1.5f,"klaas",0.2f,0.2f);
        Joogivaat vaat1 = new Joogivaat(90f,47f,l1);
        System.out.println(vaat1.pudeldaPalju(l2));
        System.out.println(vaat1.kogus);
    }
}
