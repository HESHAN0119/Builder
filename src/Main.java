public class Main {
    public static void main(String[] args) {
        Phone p =new PhoneBuilder().setOs("Android").setRam(4).getPhone();

        System.out.println(p);
    }
}