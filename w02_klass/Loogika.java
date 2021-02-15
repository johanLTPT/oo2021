public class Loogika {
    public static int arvuta(String tehe, Integer a, Integer b ){
        if(tehe == "a+b"){
            return konjuktsioon(a,b);
        }
        if(tehe == "avb"){
            return disjunktsioon(a,b);
        }
        if(tehe == "a=>b"){
            return implikatsioon(a,b);
        }
        if(tehe == "a<=>b"){
            return ekvivalents(a,b);
        }else{
            return 2;
        }
    }
    public static int eitus(Integer a){
        if(a == 1){
            return 0;
        }else{
            return 1;
        }
    }
    public static int konjuktsioon(Integer a, Integer b){
        if(a == 1 && b ==1){
            return 1;
        }else{
            return 0;
        }
    }
    public static int disjunktsioon(Integer a, Integer b){
        if(a == 0 && b ==0){
            return 0;
        }else{
            return 1;
        }
    } 
    public static int implikatsioon(Integer a, Integer b){
        if(a == 1 && b ==0){
            return 0;
        }else{
            return 1;
        }
    }
    public static int ekvivalents(Integer a, Integer b){
        if(a == b ){
            return 1;
        }else{
            return 0;
        }
    }  
}