package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        String[] resoult;
        try (FileInputStream namesOI = new FileInputStream("src/ Resources/names.txt")) {
            String text = "";
            int i = -1;
            while ((i = namesOI.read()) != -1) {
                text = text +(char) i;
            }
            resoult=text.split(",");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Arrays.toString(resoult));
    }
}
