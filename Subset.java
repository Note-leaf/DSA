public class Subset {
   static boolean isSubset(int arr1[], int arr2[], int n, int m){
       for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               if(arr1[j]==arr2[i]){
                   break;
               }
               if (j == m) {
                   return false;
               }
           }
       }
       return true;
   }
   public static void main(String[] args){
       int arr1[] = {1,2,3,4,5,6};
       int arr2[] = {1,4,6};
       int m = arr2.length;
       int n = arr1.length;
       if(isSubset(arr1, arr2, m, n)){
           System.out.println("arr2 is a sub set of arr1");
       }
       else{
           System.out.println("arr2 is not a sub set of arr1");
       }
   }
}
