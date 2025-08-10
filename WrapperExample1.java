public class WrapperExample1 {
    public static void main(String[] args) {
        int a = 20;
        Integer obj = Integer.valueOf(a);
//// converting int to Integer (manual boxing)
        System.out.println("Primitive int: " + a);
        System.out.println("Objective Integer: " + obj);
    }
}
