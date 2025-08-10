
import java.util.ArrayList;
public class WrapperExample4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        for(Integer num : list){
            System.out.println(num);
            // You cannot use ArrayList<int>, so we use ArrayList<Integer>.
      ArrayList<Integer> prices = new ArrayList<>();

      prices.add(100); //int auto-boxed to Integer
      prices.add(200);

      int total = 0;
      for(Integer price : prices){
        total += price;  //auto boxing
      }
      System.out.println("Total price: " + total);

    Integer x = 10;
    Integer y = x;
    x = 20;
    System.out.println(y);

   Integer obj = Integer.valueOf(5);     // Autoboxing
     int m = obj.intValue();         //un boxing

     System.out.println(obj);
     System.out.println(m);
        }
    }
}
