import java.util.*;
import java.io.*;

public class ArithmeticOperations{

     public static void main(String []args) throws IOException{
    
        double d1,d2;
        //Using bufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter two double numbers: ");
        d1 = Double.parseDouble(br.readLine());
        d2 = Double.parseDouble(br.readLine());
        //Using Scanner
    /*    
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two double numbers: ");
        d1 = scan.nextDouble();
        d2 = scan.nextDouble();
    */        
        try{
            System.out.println("Arithmetic operations:");
            System.out.println("Addition: " + (d1+d2));
            System.out.println("Subtraction: " + (d1-d2));
            System.out.println("Multiplication: " + (d1*d2));
            System.out.println("Division: " + (d1/d2));
            System.out.println("Modulus: " + (d1%d2));
        }catch(ArithmeticException e){
            e.printStackTrace();
        }
        
    
     }
}
