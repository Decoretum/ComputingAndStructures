package Introduction;
import java.util.*;

public class Divisors {
    
    //Find divisors
    public static void divisors(int num){
        ArrayList<Integer> divs = new ArrayList<>();
        int div = 2;
        int orig = num;
        while (num > 1){
            if (num % div == 0)
            {  
                if (!divs.contains(div))
                {
                    divs.add(div);
                }
                num /= div;
            } 
            else
            {
                div++;
            }
        }
        System.out.println("Divisors of " + orig +" :" + divs);

    }
    public static void main (String args[]){
        divisors(12);
    }
}
