import java.util.*;
import java.io.*;

public class IsEven{
  public static void main (String args[]) throws IOException{
    Scanner scan = new Scanner(System.in);
   // System.out.println("Enter a number: ");
    // int n = scan.nextInt();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    System.out.println(n%2==0?"Even":"Odd");
  }
}
