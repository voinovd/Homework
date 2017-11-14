import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String line = null;
        StringBuilder stringToArray = new StringBuilder("");

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            for ( int i = 0; i < 5; i++ ) {
                line = br.readLine();
                stringToArray.append(line).append(" ");
            }

            String fiveStrings = stringToArray.toString();
            String[] stringArray = fiveStrings.trim().split(" ");

            boolean isSort = false;

            while (!isSort) {
                isSort = true;
                for ( int i = 0; i < stringArray.length - 1; i++ ) {
                    if (stringArray[i].length() > stringArray[i + 1].length()) {
                        String tmp = stringArray[i];
                        stringArray[i] = stringArray[i+1];
                        stringArray[i+1] = tmp;

                        isSort = false;
                    }
                }
            }

            for ( String str : stringArray ) {
                System.out.println(str);
            }

        } catch ( IOException e) {
            e.printStackTrace();
        }


    }
}
