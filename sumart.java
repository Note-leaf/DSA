import java.util.Scanner;

public class sumart {
    public static int m1(int n,int a,int c){
        int sum =0;
        for(int i=0;i<n;i++) {
            sum = sum + a;
            a = a + c;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = scn.nextInt();
        int c = scn.nextInt();
        System.out.println(m1(n,a,c));
    }
}
