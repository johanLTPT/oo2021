
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
public class Proovieksam {
    public static int kolmAritmeetiat(int a, int b, int c) {
        return (a+b+c)/3;
    }
    public static String[] Libisev(String[] kogu) {
        String[] libisev = new String[kogu.length-2];
        for (int i = 0; i < kogu.length-2; i++) {
            String temp = String.valueOf(kolmAritmeetiat(Integer.parseInt(kogu[i]),Integer.parseInt(kogu[i+1]),Integer.parseInt(kogu[i+2])));
            libisev[i]= temp;
        }
        return libisev;
    }
    public static void Joonista(String[] kogu)throws Exception{
        BufferedImage pilt=new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
		Graphics g=pilt.createGraphics();
        g.setColor(Color.GRAY);
        g.drawString("100", 0, 10);
        g.drawString("75", 0, 27);
        g.drawString("50", 0, 48);
        g.drawString("25", 0, 72);
        g.drawString("0", 0, 100);
        g.setColor(Color.GRAY);

        
        int temp10 = 0;
        int temp20 = 95-Integer.parseInt(kogu[0]);
        for (int i = 1; i < kogu.length; i++) {
            int tempp = 95-Integer.parseInt(kogu[i]);
            g.drawLine(temp10+2,temp20+2,temp10+12,tempp+2);
            temp10 = temp10 + 10;
            temp20 = tempp;
        }
        g.setColor(Color.RED);
        int counter1 = 0;
        for (int i = 0; i < kogu.length; i++) {
            int temp = 95-Integer.parseInt(kogu[i]);
            g.fillOval(counter1,temp, 5, 5);
            counter1 = counter1 + 10;
        }
        

        kogu = Libisev(kogu);
        g.setColor(Color.GREEN);
        int temp1 = 0;
        int temp2 = 95-Integer.parseInt(kogu[0]);
        for (int i = 1; i < kogu.length; i++) {
            int temp = 95-Integer.parseInt(kogu[i]);
            g.drawLine(temp1,temp2,temp1+10,temp);
            temp1 = temp1 + 10;
            temp2 = temp;
            
        }
        ImageIO.write(pilt, "png", new File("pilt1.png"));
    }

    public static void main(String argumendid[]) throws Exception{
        // esimene
        System.out.println(kolmAritmeetiat(6,3,19));
        // teine
        String[] sisend={"1","2","5","10","20","50"};
        System.out.println(Arrays.toString(Libisev(sisend)));
        // kolmas üks
        BufferedReader sisse=new BufferedReader(
            new FileReader("sisend.txt")
        );
        String[] rida1=sisse.readLine().split(" ");
        System.out.println(Arrays.toString(Libisev(rida1)));
        sisse.close();
        // kolmas 2
        Joonista(rida1);
    }
    
}
