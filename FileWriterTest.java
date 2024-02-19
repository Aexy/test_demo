import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args){

        try {
            FileWriter writer = new FileWriter("writer.txt");
            writer.write("This is that");
            writer.append("\nweaow");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
