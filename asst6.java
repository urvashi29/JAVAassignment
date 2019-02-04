import java.lang.*;
public class asst6 {
    public static void main(String []args) {
        int a;
        a=args.length;
        if(a==0)
        {
            System.out.print("No value");
        }
        else 
        {
            for(int i=0;i<a-1;i++)
            {
                System.out.print(args[i]+",");
            } 
            System.out.print(args[a-1]);
        }
    }
}