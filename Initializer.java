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
            File inputFile = new File(fileName);
            Scanner fileScanner = new Scanner(inputFile);
        }
        catch(Exception e) {

        }
    }


}
