//check whether a enterted number is even or odd
import java.util.*;
public class asst5 {
public static void main(String args[]) {
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
n=sc.nextInt();
if(n%2==0)
{
System.out.print("Number is even");
}
else {
System.out.print("Number is odd");
}
}
}