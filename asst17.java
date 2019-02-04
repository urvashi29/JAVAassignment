//add all the numbers in a given number 
import  java.util.*;
class asst17 {
    public static void main(String []args) {
        int a,c,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        a=sc.nextInt();
        for(int i=a;i>0;i=i/10)
        {
            c=i%10;
            sum=sum+c;
        }
        System.out.print("sum = "+sum);
    }
    }