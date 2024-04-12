import java.util.*;

public class tenis {
  
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      Integer[] list = {in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt()};
      Arrays.sort(list);
      System.out.println((list[0]+list[3])-(list[1]+list[2]));
      
  }
  
}