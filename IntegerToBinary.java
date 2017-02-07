import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntegerToBinary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        BufferedReader readTypedValue = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the number of type: Intereger");
        int ourInput = Integer.parseInt(readTypedValue.readLine());
        
        System.out.println("BinaryPresentation: " + Integer.toBinaryString(ourInput));
    }    
}
