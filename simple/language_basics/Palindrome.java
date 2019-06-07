import java.util.*;

public class Palindrome{
  public static void main (String args[]){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    
    int temp = n,rev = 0;
    while(n > 0){
        
        int d = n%10;
        rev = rev*10+d;
        n = n/10;
        
    }
    if(temp == rev){
        System.out.println(temp +  " is a palindrome ");
    }else{
        System.out.println(temp +  " is not a palindrome ");
    }

  }
}
