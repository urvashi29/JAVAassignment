
//check whether entered char is an alphabet,digit,special character.
import java.lang.*;

public class asst8 {
    public static void main(String[] args) {
        char val = 8;
        if ((val >= 65 && val <= 90) || (val >= 97 && val <= 122)) {
            System.out.print("Alphabet");
        } else if (val >= 48 && val <= 57) {
            System.out.print("Digit");
        } else {
            System.out.print("Special character");
        }
    }
}