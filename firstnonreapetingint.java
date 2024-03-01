import java.util.Scanner;

public class firstnonreapetingint {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            boolean isReapinting=false;
            for(int j=0;j<arr.length;j++){
                if(i != j && arr[i] == arr[j]){
                    isReapinting=true;
                    break;
                }

            }
            if(!isReapinting){
                System.out.println("The first non repeating is " + arr[i]);
            }
        }
        System.out.println("there is no");
    }
}
