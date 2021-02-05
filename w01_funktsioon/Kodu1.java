import java.util.*; 
public class Kodu1{
    public static String[] folderToName(String[] nimi) {
        int Year = Calendar.getInstance().get(Calendar.YEAR);
        String aasta = String.valueOf(Year);
        String[] newNames = new String[nimi.length];
        for(int i=0; i<nimi.length; i++){
            char kuu1 = nimi[i].charAt(6);
            char kuu2 = nimi[i].charAt(7);
            char paev1 = nimi[i].charAt(4);
            char paev2 = nimi[i].charAt(5);
            String newName = aasta + "_" + kuu1 + kuu2 + "_" + paev1 + paev2;
            newNames[i] = newName;
        }
        
        return newNames;

    }
    public static void main(String[] arg){
        String[] folderid= folderToName(new String[]{
            "103_0101", "104_2001","105_2501", "106_3001", "107_0102"
        });
        for(int i=0; i<folderid.length; i++){
            System.out.println(folderid[i]);
        }
        
    }
}

