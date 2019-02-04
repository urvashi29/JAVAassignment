//print all prime numbers between 10 and 99 
import java.lang.*;
class asst16 {
    public static void main(String []args) {
      
        for(int i=10;i<=99;i++)
        {
            int count=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==2)
        {
            System.out.print(i+"\t");
        }
        }
        
    }
}