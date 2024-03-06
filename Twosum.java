import java.util.Scanner;

public class Twosum {
    public static void isTwosum(int[] n, int t){
        int d =0;
        for(int i =0;i<n.length;i++){
            for(int j=i+1;j<n.length;j++){
                if(i+j==t){
                    System.out.println(i+","+j);
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int[] n = new int[a];
        for(int i=0;i<n.length;i++){
            n[i]=scn.nextInt();
        }
        int t = scn.nextInt();
        Twosum.isTwosum(n,t);
    }
}
