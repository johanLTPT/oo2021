import java.util.ArrayList;
public class Joogivaat {
    float ruumala;
    float kogus;
    Jook vedelik;
    public Joogivaat(float v){
        ruumala = v;
    }
    public Joogivaat(float v, float sisu, Jook jook){
        ruumala = v;
        kogus = sisu;
        vedelik = jook;
    }
    public int lisaJook(float sisu, Jook jook){
        vedelik = jook;
        if(kogus+sisu<ruumala){
            kogus += sisu;
            return 1;
        }else{
            kogus = ruumala;
            return 0;
        }
    }
    public int pudelda(Joogipudel pudel){
        if(kogus>= pudel.maht){
            pudel.lisaJook(vedelik);
            kogus -= pudel.maht;
            return 1;
        }return 0;
    }
    public ArrayList<Joogipudel> pudeldaPalju(Joogipudel pudel){
        ArrayList<Joogipudel> konteiner=new ArrayList<Joogipudel>();
        for(int i=0; kogus>0.0;i++){
            Joogipudel test= new Joogipudel(pudel);
            if(pudelda(test) != 1){
               break; 
            };
            konteiner.add(test);
        }
        

        return konteiner;
    }
}
