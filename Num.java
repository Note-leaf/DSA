public class Num {
        public static boolean containsElement(int[] arr, int target) {
            for (int num : arr) {
                if (num == target) {
                    return true;
                }
            }
            return false;
        }

        public static void main(String[] args) {
            int[] arr = {5, 3, 9, 1, 7};
            int target = 9;
            if (containsElement(arr, target)) {
                System.out.println("Array contains " + target);
            } else {
                System.out.println("Array does not contain " + target);
            }
        }
    

}
