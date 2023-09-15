import java.util.*;
public class count_digit_in_number {
  
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter th number: ");
        int n = scn.nextInt();
         int x=n;
         int count=0;
        while(x!=0)
        {
            x=x/10;
            count++;
        }
        System.out.println(count);
        
        
    }
}

