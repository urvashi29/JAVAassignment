//check whether number is +,-,0
import java.util.*;
public class asst4 {
	public static void main (String args[]) {
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	n=sc.nextInt();
	if(n<0)
	{
	System.out.print("number is negative");
	}
	else if(n>0) {
	System.out.print("number is postive");
	}
	else
	{
	System.out.print("number is zero");
	}
    }
}