import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
public class AutomaatTestid{
    //Anioonid
    Ioon NO3 = new Ioon("Nitraat",(14.01+3*16.00),-1.0);
    Ioon Cl = new Ioon("Kloriid",35.45,-1.0);
    Ioon Br = new Ioon("Bromiid",79.90,-1.0);
    Ioon SO4 = new Ioon("Sulfaat",(32.07+4*16.00),-2.0);
    //Katioonid
    Ioon H = new Ioon("Vesinik",1.008,+1.0);
    Ioon Na = new Ioon("Naatrium",22.99,+1.0);
    Ioon K = new Ioon("Kaalium",39.10,+1.0);
    Ioon Ca = new Ioon("Kaltsium",40.08,+2.0);
    Ioon Mg = new Ioon("Magneesium",24.31,+2.0);

    @Test
    public void IooniLoomineJaKysimine(){
        assertEquals(62.01, NO3.kysiAatomMassideSumma(), 0.0001);
        assertEquals("Vesinik", H.kysiNimetus());
    }
    @Test
    public void AineLoomineJaKysimine1(){
        Molekul Mol = new Molekul(K, Br);
        assertEquals("KaaliumBromiid", Mol.kysiNimetus());
    }
    @Test
    public void AineLoomineJaKysimine3(){
        Molekul Mol = new Molekul(Br, K);
        assertEquals("KaaliumBromiid", Mol.kysiNimetus());
    }
    @Test
    public void AineLoomineJaKysimine2(){
        Molekul Mol = new Molekul(H,NO3);
        assertEquals("VesinikNitraat", Mol.kysiNimetus());
    }
    @Test
    public void AineLoomineJaKysimine4(){
        Molekul Mol = new Molekul(SO4,K);
        assertEquals("võimatu", Mol.kysiNimetus());
    }
    @Test
    public void M1(){
        Ioon[] konteiner = {Ca,Cl,Cl};
        MassiivneMolekul Mol = new MassiivneMolekul(konteiner);
        assertEquals(110.98, Mol.kysiMolekulMass(),0.0001);
    }
    @Test
    public void M3(){
        Ioon[] konteiner = {Ca,Cl,Cl};
        MassiivneMolekul Mol = new MassiivneMolekul(konteiner);
        assertEquals("KaltsiumDiKloriid", Mol.kysiNimetus());
    }
    
}
