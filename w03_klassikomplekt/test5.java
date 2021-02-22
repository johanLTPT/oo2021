public class test5 {
    public static void main(String[] arg){
        luliti l1 = new luliti(1);
        luliti l2 = new luliti(0);
        luliti l3 = new luliti(0);
        yhendus v1 = new  yhendus(l1,l2,1);
        yhendus v2 = new  yhendus(l2,l3,0);
        yhendus v3 = new  yhendus(l2,l3,0);
        l2.Lylita();
        System.out.println(v1.test());
        System.out.println(v2.test());
        vooluring vool1 = new vooluring();
        vool1.lisa(v1);
        vool1.lisa(v2);
        vool1.lisa(v3);
        System.out.println(vool1.jookse());
        l2.Lylita();
        System.out.println(vool1.jookse());
    }
}
