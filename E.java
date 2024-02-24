import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value");
        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i+j==n+1){
                    System.out.print("*\t");
                }
                else{
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
    }
}
