import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Напишите слово...");
        String word = reader.readLine();
        System.out.println(word);
    }
}
