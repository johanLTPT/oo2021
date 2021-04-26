public class kysimusPikkTekst extends kysimus {
    String[] lahendused = {"20"};

    public kysimusPikkTekst(String l) {
        lahendused[0] = l;
    }
    public kysimusPikkTekst() {
    }
    public int kysiVastus() {
        int len = Integer.parseInt(lahendused[0]);
        if (vastus.length() >= len) {
            return 1;
        }
        return 0;
    }
}
