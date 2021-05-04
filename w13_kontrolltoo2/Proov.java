import java.io.*;
import java.net.*;
import java.util.*;

public class Proov {
    public static ArrayList<MassiivneMolekul> LeiaIoonid(Ioon[] Sisend){
        ArrayList<MassiivneMolekul> Molekulid=new ArrayList<MassiivneMolekul>();
        for (int i = 0; i < Sisend.length; i++) {
            for (int k = i+1; k < Sisend.length; k++) {
                if (Sisend[i] != Sisend[k]) {
                    Ioon[] S ={Sisend[i],Sisend[k]};
                    MassiivneMolekul Mol = new MassiivneMolekul(S);
                    if(!Mol.kysiNimetus().equals("võimatu")){
                        Molekulid.add(Mol);
                    }
                }
            }
        }
        for(MassiivneMolekul p : Molekulid) {
            System.out.println(p.kysiNimetus());
    }return Molekulid;

    }

    public static Ioon[] LoeList() {
        int lines = 0;
        try{BufferedReader br = new BufferedReader(new FileReader("loetelu.txt"));
        while (br.readLine() != null) {
            lines++;
        }
        String[] Ained = new String[lines];
        
        BufferedReader sisse = new BufferedReader(new FileReader("loetelu.txt"));
        for (int i = 0; i < Ained.length; i++) {
            Ained[i] = sisse.readLine();
        }
        Hashtable<String, Ioon> my_dict = new Hashtable<String, Ioon>();
        Ioon NO3 = new Ioon("Nitraat", (14.01 + 3 * 16.00), -1.0);
        Ioon Cl = new Ioon("Kloriid", 35.45, -1.0);
        Ioon Br = new Ioon("Bromiid", 79.90, -1.0);
        Ioon SO4 = new Ioon("Sulfaat", (32.07 + 4 * 16.00), -2.0);
        // Katioonid
        Ioon H = new Ioon("Vesinik", 1.008, +1.0);
        Ioon Na = new Ioon("Naatrium", 22.99, +1.0);
        Ioon K = new Ioon("Kaalium", 39.10, +1.0);
        Ioon Ca = new Ioon("Kaltsium", 40.08, +2.0);
        Ioon Mg = new Ioon("Magneesium", 24.31, +2.0);
        my_dict.put("H", H);
        my_dict.put("Na", Na);
        my_dict.put("Cl", Cl);
        my_dict.put("Ca", Ca);
        my_dict.put("SO4", SO4);
        my_dict.put("NO3", NO3);
        my_dict.put("Br", Br);
        my_dict.put("K", K);
        my_dict.put("Mg", Mg);
        Ioon[] Ioonid = new Ioon[Ained.length];
        for(int i = 0; i < Ained.length; i++){
            Ioonid[i] = my_dict.get(Ained[i]);
        }
        return Ioonid;
    }catch(Exception E){System.out.println(E);}
    Ioon[] Ioonid = new Ioon[0];
    return Ioonid;
    }

    public static void main(String[] args) {
        LeiaIoonid(LoeList());
        
}
}
