import java.io.*;
import java.util.Scanner;

public class Keyword{
    public void keyword() throws IOException {
        String word = "";
        int val = 0;
        while(!word.matches("quit")) {
            System.out.println("Enter the word to be searched for");
            Scanner input = new Scanner(System.in);
            word = input.next();
            Scanner file = new Scanner(new File("information.txt"));

            while (file.hasNextLine()) {
                String line = file.nextLine();
                if (line.contains(word)) {
                    BufferedReader br = null;
                    String strLine = "";
                    try {
                        LineNumberReader reader = new LineNumberReader(new InputStreamReader(new FileInputStream("information.txt"), "UTF-8"));
                        while (((strLine = reader.readLine()) != null) && reader.getLineNumber() <= 9) {
                            System.out.println(strLine);
                        }
                        reader.close();
                    } catch (FileNotFoundException e) {
                        System.err.println("There are no items containing this word");
                    }
                    break;
                } else {
                    val = 0;
                    continue;
                }

            }

        }
    }


}
