import java.lang.Math;
import java.util.ArrayList;
public class MassiivneMolekul implements MolekulLiides {
    String nimetus;
    Double molekulMass=0.0;
    String[] Liidesed = {"","","Di","Tri","Tetra","Penta","Heksa","Hepta","Okta","Nona","Deka"};

    public MassiivneMolekul(Ioon[] Sisend){
        Double Laeng = 0.0;
        for(int i = 0; i< Sisend.length; i++) {
            Laeng += Sisend[i].kysiLaeng();
            molekulMass += Sisend[i].kysiAatomMassideSumma();
        }
        if (Laeng == 0d) {
            Ioon i1 = Sisend[0];
            int i1C = 0;
            Ioon i2 = null;
            int i2C = 0;
            for(int i = 0; i< Sisend.length; i++) {
                if (Sisend[i].equals(i1)) {
                    i1C += 1;
                }
                if (!Sisend[i].equals(i1)) {
                    i2 = Sisend[i];
                    i2C +=1;
                }
            }
            if (i1.kysiLaeng()>0d) {
                nimetus = Liidesed[i1C]+i1.kysiNimetus()+Liidesed[i2C]+i2.kysiNimetus();
            }else{
                nimetus = Liidesed[i2C]+i2.kysiNimetus()+Liidesed[i1C]+i1.kysiNimetus();
            }

        } else {nimetus="võimatu";molekulMass=0d;}

    }
    public String kysiNimetus(){
        return nimetus;
    }
    public Double kysiMolekulMass(){
        return molekulMass;
    }
}