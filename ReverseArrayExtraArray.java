public class ReverseArrayExtraArray {
    public static void reverseArrayExtraArray(int[] arr) {
        int[] reArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reArr[i] = arr[arr.length - i - 1];
        }
        System.out.print("Reversed Array: ");
        for (int i : reArr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] originalArr = {1, 2, 3, 4, 5};
        reverseArrayExtraArray(originalArr);
    }
}
