import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class PersonGenerator {
    public static void main(String[] args) {
        Boolean cont = true;

        while (cont == true) {
            String prompt = ("Please enter names");
            Scanner pipe =  new Scanner(System.in);


            String returnName = SafeInput.getNonZeroLenString(pipe, prompt);
            System.out.print(returnName);

            String continueNames = ("Do you want to enter another name? y/n");
            String yesNo = SafeInput.getNonZeroLenString(pipe, continueNames);

            if (continueNames.equalsIgnoreCase("n")) {
                cont = false;

            } else if (continueNames.equalsIgnoreCase("y")) {
                cont = true;
            }
            else{
                System.out.println(yesNo + " is not a valid input. Please type y or n");
            }
            List<String> namesArray = new ArrayList<>(Arrays.asList(returnName.split(" ")));

        }




    }
}
