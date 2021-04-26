import org.junit.*;
import static org.junit.Assert.*;
public class kysitlusTest {
    kysitlusLiides k = new kysitlusRealiseeriv();
    @Before
    public void alusta(){
        
    }
    @Test
    public void sisestus1(){
        k.vasta("BMW");
        assertEquals(1,k.kysiVastus());
    }
    @Test
    public void sisestus2(){
        String[] lahendused = {"vastus", "vastus3", "vastus2", "vastus1"};
        k.seadista(lahendused);
        k.vasta("BWM");
        assertEquals(0,k.kysiVastus());
    }
    @Test
    public void sisestus3() {
        k.seadista("volks",1);
        k.vasta("volks");
        assertEquals(1,k.kysiVastus());
    }
    @Test
    public void arvutus1() {
       
    }
}
