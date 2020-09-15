import java.util.Scanner;

public class MyMain {
    
    public static int binaryToDecimal(String binary) {
        int output = 0;
        for (int i = binary.length()-1; i >= 0; i--) {
            output += Integer.parseInt(binary.substring(i, i+1)) * Math.pow(2, binary.length()-1-i);
        }
        return output;
        // But also why not just use this: return Integer.parseInt(binary, 2);
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type in a number in binary format: ");
        System.out.println("That is equal to the decimal value: " + binaryToDecimal(scan.next()));
        scan.close();
    }
}
