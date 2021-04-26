public class kysitlusTest {
    public static void main(String[] args) {
        String[] lahendused = {"vastus", "vastus3", "vastus2", "vastus1"};

        kysimusValik kysimus1 = new kysimusValik("3");
        kysimusTekst kysimus2 = new kysimusTekst(lahendused);
        kysimusTekst kysimus3 = new kysimusTekst(lahendused);
        kysimusTekst kysimus4 = new kysimusTekst(lahendused);
        kysimusTekst kysimus5 = new kysimusTekst(lahendused);
        kysimus1.vasta("3");
        kysimus2.vasta("vastus2a");
        kysimus3.vasta("vastus2");
        kysimus4.vasta("vastus3");
        kysimus5.vasta("vastus");
        System.out.println(kysimus2.kysiVastus());
        kysitlus kysitlus1 = new kysitlus();
        kysitlus1.lisa(kysimus1);
        kysitlus1.lisa(kysimus2);
        kysitlus1.lisa(kysimus3);
        kysitlus1.lisa(kysimus4);
        kysitlus1.lisa(kysimus5);
        System.out.println(kysitlus1.maxStreak());
        System.out.println(kysitlus1.hinda(80));
        System.out.println(kysitlus1.hinda(81));
    }
}
