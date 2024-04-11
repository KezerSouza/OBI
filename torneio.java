import java.util.*;

public class torneio {
  
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      int vitorias = 0;
      for (int i = 6 ;i > 0 ;i--) {
        if(in.next().equals("V")) {
          vitorias += 1;
        }
      } 
      
      if(vitorias == 1 || vitorias == 2) {
        System.out.printf("3\n");
      }else if (vitorias == 3 || vitorias == 4) {
        System.out.printf("2\n");
      }else if (vitorias == 5 || vitorias == 6) {
        System.out.printf("1\n");
      }else {
        System.out.printf("-1\n");
      }
      
  }
  
}