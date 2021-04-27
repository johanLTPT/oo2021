import org.junit.*;
import static org.junit.Assert.*;
public class Joogitestid{
    Jook vesi=new Jook("vesi",0.2f,1.0f);
    Jook koola=new Jook("koola",0.8f,1.2f);
    Jook piim=new Jook("piim",0.35f,1.1f);
    Joogipudel suur = new Joogipudel(1.5f,"plastik",0.05f,0.1f);
    Joogipudel keskmine = new Joogipudel(0.75f,"plastik",0.025f,0.1f);
    Joogipudel vaike = new Joogipudel(0.5f,"klaas",0.25f,0.2f);
    Joogivaat vaat1 = new Joogivaat(100f);
    Kast kast1 = new Kast("papp",0.25f,0.5f,12);
    

    @Test
    public void esimene(){
        Joogipudel l1 = new Joogipudel(suur);
        Joogipudel l2 = new Joogipudel(keskmine);
        Joogipudel l3 = new Joogipudel(vaike);
        assertEquals(0.025f, l2.leiaMass(), 0.00001f);
        l3.lisaJook(vesi);
        assertEquals(0.75f, l3.leiaMass(), 0.00001f);
    }
    @Test
    public void teine(){
        vaat1.lisaJook(100,piim);
        vaat1.pudeldaPalju(vaike);
        assertEquals(0.0f, vaat1.kogus, 0.00001f);
        vaat1.lisaJook(1f,koola);
        vaat1.pudeldaPalju(suur);
        assertEquals(1.0f, vaat1.kogus, 0.00001f);
    }
    @Test
    public void kolmas(){
        assertEquals(0.5f, kast1.koguMass(), 0.00001f); 
        vaat1.lisaJook(1.5f, koola);
        kast1.lisaPudelid(vaat1.pudeldaPalju(vaike));
        assertEquals(3, kast1.Pudelid.size(), 0.00001);
    }
}
