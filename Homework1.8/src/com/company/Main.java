import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static final String FILE_NAME = "inputFile.txt";

    public static void main(String[] args) {

        String line = null;
        String subLine = null;

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {

            int lineCount = 0;
            while ( (line = br.readLine()) != null ) {
                System.out.println( line );
                lineCount++;
            }

//            int[] lineLength = new int[lineCount];

            br.reset();
            lineCount = 0;
            int lengthOfAllLines = 0;
            while ( (line = br.readLine()) != null ) {
                System.out.println( "Length of " + lineCount + " line = " + line.length() );
                lengthOfAllLines += line.length();
                lineCount++;
            }

            System.out.println( "Length of all lines = " + lengthOfAllLines );

        } catch ( IOException e) {
            e.printStackTrace();
        }
    }
}
