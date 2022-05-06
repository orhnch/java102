package getencoding;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class getEncoding {
    public static void main(String[] args) {

        try {
            FileOutputStream file = new FileOutputStream("output.txt");

            OutputStreamWriter output1 = new OutputStreamWriter(file);

            OutputStreamWriter output2 = new OutputStreamWriter(file, StandardCharsets.UTF_8);

            System.out.println("Character encoding of output1: " + output1.getEncoding());
            System.out.println("Character encoding of output2: " + output2.getEncoding());

            output1.close();
            output2.close();
        }

        catch(Exception e) {
            e.getStackTrace();
        }
    }
}
