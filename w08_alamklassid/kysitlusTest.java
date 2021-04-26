public class kysitlusTest {
    public static void main(String[] args) {
        kysimusValik kysimus1 = new kysimusValik("3");
        kysimus1.vasta("3");
        System.out.println(kysimus1.kysiVastus());
        String[] lahendused = {"vastus", "vastus3", "vastus2", "vastus1"};
        kysimusTekst kysimus2 = new kysimusTekst(lahendused);
        kysimus2.vasta("vastus2");
        System.out.println(kysimus2.kysiVastus());
    }
}
