package firmansyah.java.app;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReaderApp {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("README.md"))) {
            while (true) {
                String text = reader.readLine();
                if(text == null){
                    break;
                }
                System.out.println(text);
            }
        } catch (Throwable e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
