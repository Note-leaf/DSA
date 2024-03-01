import java.util.Scanner;

public class geometric {
        public static float m1(int n,float a,float c){
            float sum =0;
            for(int i=0;i<n;i++) {
                sum = sum + a;
                a = a * c;
            }
            return sum;
        }
        public static void main(String[] args){
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            float a = scn.nextFloat();
            float c = scn.nextFloat();
            System.out.println(m1(n,a,c));
        }

}
