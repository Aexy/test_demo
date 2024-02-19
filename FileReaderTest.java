import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("writer.txt");
            int data = reader.read();

            while(data != -1){
                System.out.print((char)data);
                data = reader.read();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }catch(IOException f){
            f.printStackTrace();
        }
    }
}
