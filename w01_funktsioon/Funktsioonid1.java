public class Funktsioonid1 {
    public static String temperatuuriHinnang(int t) {
        if(t<18){return "külm";}
        return "soe";
    }
    public static double taksoHinnang(int km) {
        return 3 + (0.8*km);
    }
    public static double ringiPindala(double r) {
        return Math.PI * r * r;
    }

    public static void main(String[] arg) {
        System.out.println(ringiPindala(5));;

        if(arg.length==1){
            System.out.println(
                temperatuuriHinnang(
                    Integer.parseInt(arg[0])));
        }

        System.out.println(taksoHinnang(5));
}
}