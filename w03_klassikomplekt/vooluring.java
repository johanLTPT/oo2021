import java.util.ArrayList;
public class vooluring {
    ArrayList<yhendus> yhendused = new ArrayList<yhendus>();
    public void vooluring(){
    }
    public void lisa(yhendus a){
        yhendused.add(a);
    }
    public String jookse(){
        int result = 1;
        for (int counter = 0; counter < yhendused.size(); counter++) { 		      
            int temp = yhendused.get(counter).test();
            if(temp == 0){
                result = 0;
            }
        }
        if(result == 1){
            return "lamp põleb";
        }else{return "lamp ei põle";}
    }
}
