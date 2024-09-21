import java.util.Arrays;
import java.util.List;

public class For_eachloop {

   public static void main(String args[]) {
	int[] numbers = {10,20,30,40,50};
      for(int x=0; x < 5 ; x = x + 1 ){
	if(x == 3)
	break; 
         System.out.print( numbers[x] );
         System.out.print(",");
      }
   }
}