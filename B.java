import java.util.Scanner;

public class B {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value");
        int n = scn.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n;j++){
                if(j<i){
                    System.out.print("-\t");
                }
                else{
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }
}
