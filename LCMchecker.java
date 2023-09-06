import java.util.*;
public class LCMchecker {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 positive integer");
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        int n3= sc.nextInt();

        int lcm= 1;

        while(true)
        {
          if(lcm % n1 == 0 && lcm % n2 == 0 && lcm%n3 == 0)
          {break;}
          lcm++;
        }
         
       System.out.println(lcm);
      
       sc.close();

    }
}
