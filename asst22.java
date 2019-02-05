//searching in an array
import java.util.*;
class asst22 {
    public static void main(String []args) 
    {  int arr[]=new int[5];
        int d=0,count=0; 
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter elements in an array");
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter element to be searched");
        int x=sc.nextInt();
        for(int i=0;i<5;i++)
        {
            if(x==arr[i])
            {
                count++;
                d=i;
            }
        }
                if(count>0)
                {
                    System.out.println(d);
                
                }
                else{
                    System.out.println("-1");
                }
        

    }
}