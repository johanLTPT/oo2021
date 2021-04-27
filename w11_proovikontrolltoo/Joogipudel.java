public class Joogipudel{
    Float maht;
    String pudelityyp;
    Float mass;
    Float taara;
    Jook jook;
    public Joogipudel(Float mah, String pud, Float mas, Float tar){
        maht = mah;
        pudelityyp = pud;
        mass = mas;
        taara = tar;
    }
    public Joogipudel(Joogipudel pudel){
        maht = pudel.maht;
        pudelityyp = pudel.pudelityyp;
        mass = pudel.mass;
        taara = pudel.taara;
    }
    public Joogipudel(Float mah, String pud, Float mas, Float tar, Jook sisu){
        maht = mah;
        pudelityyp = pud;
        mass = mas;
        taara = tar;
        jook = sisu;
    }
    public void lisaJook(Jook sisu){
        jook = sisu;
    }
    public Float leiaMass(){
        if(jook != null){
            return mass + jook.omakaal*maht;
        }else{
            return mass;
        }
    }
    public Float leiaHind(){
        if(jook != null){
            return taara + (jook.liitrihind*maht);
        }else{
            return taara;
        }
    }
}
