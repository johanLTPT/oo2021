import java.util.*;
public class kysitlus {
    List<kysimus> hoidla=new ArrayList<kysimus>();
    public void lisa(kysimus v){hoidla.add(v);}
    public boolean kasVeatu(){
		for(kysimus v: hoidla){
			if(v.kysiVastus()==0){return false;}
			
		}
		return true;
	}
    public String maxStreak(){
        int samm = 0;
        int maxStreak = 0;
        int Streak = 0;	
        while (hoidla.size() > samm) {
            if(hoidla.get(samm).kysiVastus()==1){
                Streak++;
                if (Streak>maxStreak) {
                    maxStreak=Streak;
                }

            }else{
                Streak=0;
            }
            samm++;
        }return maxStreak+"";
	}
    public int[] punktid(){
        int samm = 0;
        int[] points = {0,0};
        while (hoidla.size() > samm) {
            points[1]++;
            if(hoidla.get(samm).kysiVastus()==1){
                points[0]++;}
            samm++;
        }return points;
    }
    public String hinda(double protsent){
        int[] punktid = punktid();
        if(((((double) punktid[0])/punktid[1])*100)>=protsent){return "passed";}
        else{return"failed";}
    }      
}
