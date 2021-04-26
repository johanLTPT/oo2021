public class kysimusValik extends kysitlus {
    String[] lahendused = {"1"};

    public kysimusValik(String l) {
        lahendused[0] = l;
    }

    public kysimusValik() {
    }
    public int kysiVastus() {
        System.out.println(vastus);
        System.out.println(lahendused[0]);
        if (vastus.equals(lahendused[0])) {
            return 1;
        }
        return 0;
    }
}
