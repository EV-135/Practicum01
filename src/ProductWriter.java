import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

import static java.nio.file.StandardOpenOption.CREATE;

public class ProductWriter {
    public static void main(String[] args) {
        boolean cont = true;
        List<String> namesArray = new ArrayList<>();

        File workingDirectory = new File(System.getProperty("user.dir"));
        Path file = Paths.get(workingDirectory.getPath() + "\\src\\ProductTestData.txt");

        Scanner pipe =  new Scanner(System.in);
        String id = "";
        String name = "";
        String description = "";
        double cost = 0;
        String record = "";


        while (cont) {
            id = SafeInput.getNonZeroLenString(pipe, "Enter a 6 digit ID");
            name = SafeInput.getNonZeroLenString(pipe, "Enter name");
            description = SafeInput.getNonZeroLenString(pipe, "Enter a description");
            cost = SafeInput.getDouble(pipe, "Enter cost");



            record = (id+", "+name+", "+description+", "+cost);
            namesArray.add(record);

            cont = SafeInput.getYNConfirm(pipe, "Do you want to add another entry?");
        }
        for(String nameOut : namesArray) {
            System.out.println(nameOut);
        }

        try
        {
            // Typical java pattern of inherited classes
            // we wrap a BufferedWriter around a lower level BufferedOutputStream
            OutputStream out =
                    new BufferedOutputStream(Files.newOutputStream(file, CREATE));
            BufferedWriter writer =
                    new BufferedWriter(new OutputStreamWriter(out));

            // Finally can write the file LOL!

            for(String rec : namesArray)
            {
                writer.write(rec, 0, rec.length());  // stupid syntax for write rec
                // 0 is where to start (1st char) the write
                // rec. length() is how many chars to write (all)
                writer.newLine();  // adds the new line

            }
            writer.close(); // must close the file to seal it and flush buffer
            System.out.println("Data file written!");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }





    }
}
