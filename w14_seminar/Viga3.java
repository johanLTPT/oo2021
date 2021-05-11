public class Viga3 {
    public static String Login(Boolean login){
        if (login == false) {
            throw new SecurityException("Login failed");
        } else {
            return "Success";
        }
    }
    public static void main(String[] args) {
        Boolean login = true;
        Boolean login2 = false;
        System.out.println(Login(login));
        System.out.println(Login(login2));
    }
}
