public class kysimusValik extends kysimus {
    String[] lahendused = {"1"};

    public kysimusValik(String l) {
        lahendused[0] = l;
    }

    public kysimusValik() {
    }
    public int kysiVastus() {
        if (vastus.equals(lahendused[0])) {
            return 1;
        }
        return 0;
    }
}
