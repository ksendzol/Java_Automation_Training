import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;   

public class HelloNamesList {
    
    public static void main(String[] args) throws IOException {
        
        System.out.println("Please enter the list of Names");
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        Scanner scanner = new Scanner(input);
        
        while(scanner.hasNext()) {   
            System.out.println("Hello " + scanner.next());
        }
    }
}