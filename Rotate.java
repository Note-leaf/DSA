import java.util.Scanner;

public class Rotate {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int d = scn.nextInt();
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int k=0;
        int[] temp = new int[n];
        for(int i=d;i<n;i++){
           temp[k] = arr[i];
           k++;
        }
        for (int i = 0; i < d; i++) {
            temp[k] = arr[i];
            k++;
        }
        for(int i=0;i<n;i++){
            arr[i] = temp[i];
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
