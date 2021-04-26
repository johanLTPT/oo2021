public class kysimusTekst extends kysimus {
    String[] lahendused = { "Volvo", "BMW", "Ford", "Mazda" };

    public kysimusTekst(String[] l) {
        lahendused = l;
    }
    public kysimusTekst() {
    }
    public int kysiVastus() {
        for (int i = 0; i < lahendused.length; i++) {
            if (vastus.equals(lahendused[i])) {
                return 1;
            }
        }
        return 0;
    }
}
