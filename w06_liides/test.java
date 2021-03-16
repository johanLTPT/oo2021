public class test {
    public static void main(String[] args) {
        valikvastusega kysimus1 = new valikvastusega(3);
        kysimus1.vasta("2");
        System.out.println(kysimus1.kysiVastus());
        String[] lahendused = {"vastus", "vastus3", "vastus2", "vastus1"};
        tekstiga kysimus2 = new tekstiga(lahendused);
        kysimus2.vasta("vastus");
        System.out.println(kysimus2.kysiVastus());
    }
}
