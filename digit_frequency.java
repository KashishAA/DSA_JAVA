import java.util.*;
public class digit_frequency {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = scn.nextInt();
        System.out.println("Enter the digit:");
        int d= scn.nextInt();
        int f = getfreq(n , d);
        System.out.print(f);

        }
        public static int getfreq(int n , int d)
        {
            int rem;
            int count=0;
            while(n!=0){
                rem= n%10;
                n/=10;
                if(rem==d){
                    count++;
                }
               
            }
              return count;
    }
    
    
}
