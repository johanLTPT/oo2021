public class yhendus {
    luliti a;
    luliti b;
    int liik;
    public yhendus(luliti esimene, luliti teine, int sisend){
        a=esimene;
        b=teine;
        liik=sisend;
    }
    public int test(){
        if (liik ==1){
            if(a.sees == 1 && b.sees ==1){
                return 1;
            }else{
                return 0;
            }
        }else{
            if(a.sees == 1 || b.sees ==1){
                return 1;
            }else{
                return 0;
            }
        }
        } 

}
