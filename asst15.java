//check whether the entered number is a prime number or not

import java.util.*;
class asst15 {
    public static void main(String []args) {
        int n,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        if(n==0||n==1)
        {
            System.out.print(n+"is neither composite nor prime");
        }
        else {

        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
        {
             count++;
        }       
     }
     if(count==2)
     {
         System.out.print("prime");
     }
     else
     {
     System.out.print("Not a prime number");
     }
    }
}
} 