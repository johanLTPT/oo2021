public class Jook {
    String nimetus;
    Float liitrihind;
    Float omakaal;
    public Jook(String nim, Float lit, Float oma){
        nimetus = nim;
        liitrihind = lit;
        omakaal = oma;
    }
    public Jook(Jook sisu){
        nimetus =sisu.nimetus;
        liitrihind = sisu.liitrihind;
        omakaal = sisu.omakaal;
    };
    public String kysiNimetus(){
        return nimetus;
    }
    public Float kysiLiitrihind(){
        return liitrihind;
    }
    public Float kysiOmakaal(){
        return omakaal;
    }
}
