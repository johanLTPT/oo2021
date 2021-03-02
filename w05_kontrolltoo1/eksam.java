import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
/*
Kirjalik lahutamine

· Väljastatakse kahe sisestatud arvu vahe absoluutväärtus.
· Ekraanile joonistatakse suurem arv üles, väiksem alla ning vahe kõige alla, kümnendkohad kohakuti.
· Võlgu võetud väärtused tähistatakse punktiga.
*/
public class eksam {
    public static double Absoluutne(double a, double b) {
        //Absoluutväärtuse leidmine ja ümardamine kümnelisteni.
        double vastus = Math.abs(a-b);
        return Math.round(vastus * 100.00)/100.0;
    }
    public static int[] ArvToNumber(double a) {
        //Arvu lahutamine individuaalseteks numbriteks
        int[] arvnumber = new int[5];
        int temp = (int)(a*10);
        for (int i = 0; i < 5; i++) {
            arvnumber[i]= (temp % 10);
            temp = temp / 10;
            
        }
        return arvnumber;
    }
    public static int Koordinaadid(double z) {
        //Sõltuvalt numbri pikkusest, vajaliku x koordinaadi panemine, et komakohad läheks kokku
        int x = 23;
        if(z<1000){
        if(z<100){
            if(z<10){
                x=44;
            }else{
                x=37;
            }
        }else{
            x=30;
        }}
        return x;
    }
    public static void Joonista(double a, double b, double c)throws Exception{

        //Pildi loomine
        BufferedImage pilt=new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
		Graphics g=pilt.createGraphics();
        //Taustagraafika joonistamine, see on ainult ilu pärast.
        Color DARKGRAY = new Color(30, 30, 30);
        g.setColor(DARKGRAY);
        g.drawString("0000.0", 23, 35);
        g.drawString("0000.0", 23, 50);
        g.drawString("0000.0", 23, 70);
        g.fillRect(25, 22, 2, 2);
        g.fillRect(32, 22, 2, 2);
        g.fillRect(39, 22, 2, 2);
        g.fillRect(46, 22, 2, 2);
        //Vastuse miinuskohtade joonistamine, see on vajalik, kuna miinuskoht liigub sõltuvalt vastusest.
        int abc=23;
        for (int i = 0; i < 4; i++) {
            g.drawLine(abc-6, 65, abc-2,65);
            abc+= 7;
        }
        //Tehete märkide joonistamine
        g.setColor(Color.GRAY);
        g.drawLine(13, 45, 18, 45);
        g.drawLine(30, 55, 60, 55);
        
        g.setColor(Color.GREEN);
        //Arvude stringideks muutmine
        String sa=String.valueOf(a);
        String sb=String.valueOf(b);
        String sc=String.valueOf(c);
        //Arvude joonistamine
        g.drawString(sa, Koordinaadid(a), 35);
        g.drawString(sb, Koordinaadid(b), 50);
        g.drawString(sc, Koordinaadid(c), 70);
        //Vastusele miinusmärgi panek, kui vajadust on
        if((a-b)<0){
        g.drawLine(Koordinaadid(c)-6, 65, Koordinaadid(c)-2,65);
        }
        int[] test = ArvToNumber(a);
        int[] test2 = ArvToNumber(b);
        int xz = 46;
        
        //Laenamise korral punktide panemine
        for (int i = 0; i < 4; i++) {
            if(test[i]<test2[i]){
                test[i+1] = test[i+1]-1;
                g.fillRect(xz, 22, 2, 2);
            }
            xz = xz-7;
        }
        ImageIO.write(pilt, "png", new File("pilt3.png"));
    }

    public static void main(String argumendid[]) throws Exception{
        double a = 1140.2;
        double b = 89.9;
        /* Kui tahaks, et suurem arv oleks alati ülevalpool. Aga siis ei saaks tulla vastus miinusmärgiga,
        ning kuna nägin liigutatava miinusmärgiga vaeva, siis praegu see välja lülitatud.
        if(b>a){
            double temp = a;
            a = b;
            b  = temp;
        }*/

        Joonista(a, b,Absoluutne(a,b));
        
    }
    
}
