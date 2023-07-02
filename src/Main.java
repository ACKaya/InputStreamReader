import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("test.txt");
            InputStreamReader reader=new InputStreamReader(file,Charset.forName("MacTurkish"));
            System.out.println(reader.getEncoding());
            int i=reader.read();
            while(i!=-1){
                System.out.print((char)i);
                i= reader.read();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
