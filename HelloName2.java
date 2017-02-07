import java.util.Scanner;   
public class HelloName2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name : ");
        String s = input.next();
        System.out.println("Hello "+s);
    }
    
}