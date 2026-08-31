import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class PersonGenerator {
    public static void main(String[] args) {
        Boolean cont = true;
        String returnName = "";
        List<String> namesArray = new ArrayList<>(Arrays.asList(returnName.split(" ")));
        while (cont == true) {
            String prompt = ("Please enter names");
            Scanner pipe =  new Scanner(System.in);


            returnName = SafeInput.getNonZeroLenString(pipe, prompt);
            System.out.print(returnName);


            namesArray.add(returnName);

            Boolean validYN = false;
            while (validYN == false) {
                String continueNames = ("Do you want to enter another name? y/n");
                String yesNo = SafeInput.getNonZeroLenString(pipe, continueNames);
                if (yesNo.equals("n") || yesNo.equals("N")) {
                    cont = false;
                    validYN = true;
                } else if (yesNo.equals("y") || yesNo.equals("Y")) {
                    cont = true;
                    validYN = true;
                } else {
                    System.out.println(yesNo + " is not a valid input. Please type y or n");
                    validYN = false;
                }
            }


        }
        System.out.println(namesArray);




    }
}
