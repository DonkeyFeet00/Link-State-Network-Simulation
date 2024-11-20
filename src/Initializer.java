import java.io.File;
import java.util.Scanner;

public class Initializer {
/*
    input file has the following format:
    Number of routers
    Router label: (neighbor label, cost); (neighbor label, cost); ….
    Router label: (neighbor label, cost); (neighbor label, cost); ….
            …..
    Router label: (neighbor label, cost); (neighbor label, cost); ….
 */

    void readFile(String fileName){
        try {
            File inFile = new File(fileName);
            Scanner fileScanner = new Scanner(inFile);

            //grab number on the first line of the file as our number of routers
            int numRouters = fileScanner.nextInt();

            //loop through all routers in the file
            while(fileScanner.hasNextLine()) {
                String currentLine = fileScanner.nextLine();
                String currentName = currentLine.substring(0, currentLine.indexOf(':'));



            }
        }
        catch(Exception e) {
            System.out.println("Error opening file: " + e);
        }
    }
}
