import java.lang.*;
public class asst9 {
    public static void main(String []args) {
        int n=Integer.parseInt(args[1]);
        if(args[0]=="female" && (n>=1 && n<=58))
        { 
            System.out.println("Interest = 8.2%");
        }
        if(args[0]=="female" && (n>=59 && n<=120))
        {
            System.out.println("Interest = 7.6%");
        }
        if(args[0]=="male" && (n>=1 && n<=60))
        {
            System.out.println("Interest = 9.2%");

        }
        if(args[0]=="male" && (n>=61 && n<=120))
        {
            System.out.println("Interest = 8.3%");
        }
        }
}