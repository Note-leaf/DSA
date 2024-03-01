import java.util.Scanner;

public class prime {
    static int d = 2;
    public static boolean isPrime(int n){
        if(n==0||n==1){
            return false;
        }
        if(n==d){
            return true;
        }
        if(n%d==0){
            return false;
        }
        d++;
        return isPrime(n);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if(isPrime(n)){
            System.out.println(n+"is prime");
        }
        else{
            System.out.println(n+"is not prime");
        }

    }
}
