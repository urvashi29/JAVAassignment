//print * in floyd's format
import java.util.*;
class asst18 {
    public static void main(String []args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        String arr[][]=new String[n][];
        for(int i=0;i<n;i++)
        {
            arr[i]=new String[i+1];
    
        }
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]="*";
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+"\t");       
            }
            System.out.println();
        }
    } 
}
