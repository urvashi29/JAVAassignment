//conver ascii to char in an array
import java.lang.*;
class asst23 {
public static void main(String []args)
{
    int arr[]={97,65,98,78};
    char c[]=new char[arr.length];
        for(int i=0;i<arr.length;i++)
        {
             c[i]=(char)arr[i];
        }      
        for(int i=0;i<arr.length;i++)
        {
        System.out.print(c[i]+"\t");
        }
    }
}