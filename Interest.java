import java.util.*;
public class Interest{

    public static void main(String []args){
        
        Scanner scan = new Scanner(System.in);
        float p,r,t,n;
        p = scan.nextFloat();
        t = scan.nextFloat();
        r = scan.nextFloat();
        n = scan.nextFloat();
        
        System.out.println("Simple interest is : " + (p*t*r)/100);
        calculateCI(p,t,r,n);
    }

    static void calculateCI(float p, float t, float r, float n) {
        double amount = p * Math.pow(1 + (r / n), n * t);
        double interest = amount - p;
        System.out.println("Compond Interest is " + interest);
        System.out.println("Amount is " + amount);
    }

}
