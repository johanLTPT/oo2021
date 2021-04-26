public abstract class kysimus {
    public String vastus = "0";
    String[] lahendused = new String[4];
    public abstract int kysiVastus();
    public void vasta(String v) {
        vastus = v;
    }
    public void seadista(String v, int i) {
        lahendused[i] = v;
    }
    public void seadista(String[] v) {
        lahendused = v;
    }
}
