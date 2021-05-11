public class rahapuuduException extends Exception {
    private double kogus;
    
    public rahapuuduException(double kogus) {
        this.kogus = kogus;
     }
     
     public double getKogus() {
        return kogus;
     }
}
