import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class PersonGenerator {
    public static void main(String[] args) {
        boolean cont = true;
        String returnName = "";
        List<String> namesArray = new ArrayList<>();
        int id = 1;
        while (cont) {
            id += 1;

            String prompt = ("Please enter names");
            Scanner pipe =  new Scanner(System.in);


            returnName = SafeInput.getNonZeroLenString(pipe, prompt);
            System.out.print(returnName);


            namesArray.add("ID-"+id);
            namesArray.add(returnName);
            namesArray.add("\n");

            boolean validYN = false;
            while (!validYN) {
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

                }
            }


        }
        System.out.println(namesArray);




    }
}
