class kysitlusRealiseeriv implements kysitlusLiides {
    String vastus = "0";
    String[] lahendused = { "Volvo", "BMW", "Ford", "Mazda" };

    public kysitlusRealiseeriv(String[] l) {
        lahendused = l;
    }

    public kysitlusRealiseeriv() {
    }

    public void vasta(String v) {
        vastus = v;
    }

    public void seadista(String v, int i) {
        lahendused[i] = v;
    }
    public void seadista(String[] v) {
        lahendused = v;
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
