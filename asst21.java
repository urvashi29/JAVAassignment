
//find max and min value in an array
import java.util.*;
class asst21 {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter values in an array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            else if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.print("max value = " + max + "\t" + "min value = " + min);

    }
}