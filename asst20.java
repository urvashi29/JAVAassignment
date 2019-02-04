//palindrome number
import java.util.*;
class asst20 {
    public static void main(String []args) {
        int n,rev=0,c;
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter a number");
        n=sc.nextInt();
        for(int i=n;i>0;i=i/10) 
        {
            c=i%10;
            rev=rev*10+c;
        }        
        if(rev==n)
        {
            System.out.print("Palindrome Number");
        }
        else
        {
            System.out.print("Not a Palindrome Number");
        }
}
}