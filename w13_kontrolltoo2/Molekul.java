import java.lang.Math;
public class Molekul implements MolekulLiides {
    String nimetus;
    Double molekulMass;
    public Molekul(Ioon yks, Ioon kaks){
        if ( yks.kysiLaeng() !=0d && 0d == (yks.kysiLaeng()+kaks.kysiLaeng())) {
            molekulMass = yks.kysiAatomMassideSumma()+kaks.kysiAatomMassideSumma();
            if (yks.kysiLaeng()>0d) {
                nimetus = yks.kysiNimetus()+kaks.kysiNimetus();
            }else{
                nimetus = kaks.kysiNimetus()+yks.kysiNimetus();
            }
        }else{nimetus="võimatu";molekulMass=0d;}
    }
    public String kysiNimetus(){
        return nimetus;
    }
    public Double kysiMolekulMass(){
        return molekulMass;
    }
}
