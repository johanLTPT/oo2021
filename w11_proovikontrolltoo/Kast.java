import java.util.ArrayList;
public class Kast {
    ArrayList<Joogipudel> Pudelid=new ArrayList<Joogipudel>();
    String kastityyp;
    float kastihind;
    float kastimass;
    int pesasid;
    public Kast(String tyyp, float hind, float mass, int pesad){
        kastityyp = tyyp;
        kastihind = hind;
        kastimass = mass;
        pesasid = pesad;   
    }
    public void lisaPudelid(Joogipudel pudel){
        if(Pudelid.size()<pesasid){
            Pudelid.add(pudel);
        }
    }
    public void lisaPudelid(ArrayList<Joogipudel> PudelidSisse){
        for(Joogipudel p : PudelidSisse) {
            if(Pudelid.size()<pesasid){
                Pudelid.add(p);
            }
         }
    }
    public float koguMass(){
        float kogumass = kastimass;
        if(Pudelid.size() > 0){
        for(Joogipudel p : Pudelid) {
            kogumass += p.leiaMass();
         }
        }return kogumass;
    }
    public float koguHind(){
        float koguhind = kastihind;
        if(Pudelid.size() > 0){
        for(Joogipudel p : Pudelid) {
            koguhind += p.leiaMass();
         }
        }return kogumass;
    }
}
