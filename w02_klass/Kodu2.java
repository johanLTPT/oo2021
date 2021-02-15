public class Kodu2 {
        public static void main(String[] arg){
            Loogika tehe1=new Loogika();
            Loogika tehe2=new Loogika();
            // a v (a=>~(a+b))
            int a = 1;
            int b = 0;
            System.out.println(tehe1.arvuta("avb",a,tehe2.arvuta("a=>b",tehe2.eitus(tehe2.arvuta("a+b",a,b)),a)));
        }
        
    }
    
