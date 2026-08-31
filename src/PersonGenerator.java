import java.util.Scanner;
import java.util.ArrayList;

public class PersonGenerator {

    public static void main(String[] args) {
        Scanner pipe =  new Scanner(System.in);
        String prompt = ("Please enter names");
        String[] nameArray = pipe.nextLine().split(" ");
        SafeInput.getNonZeroLenString(pipe, prompt);

        System.out.print(nameArray[0]);


    }
}
