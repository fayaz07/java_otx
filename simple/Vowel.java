import java.util.*;
import java.io.*;

public class Vowel{
  public static void main (String args[]) throws IOException{
    Scanner scan = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char c = (char)br.read();
    // char c = scan.next();
    switch(c){

        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U':     
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u': System.out.println("Vowel"); break;
        default: System.out.println("Consonent"); break;
        
    }

  }
}
