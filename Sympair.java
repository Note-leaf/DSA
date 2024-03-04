public class Sympair {
    public static void findSymPairs(int[][] arr, int row)
    {
        for (int i = 0; i < row; i++) {
            for (int j = i + 1; j < row; j++) {
                if (arr[i][0] == arr[j][1]
                        && arr[i][1] == arr[j][0]) {
                    System.out.print("("+arr[i][0]+", "+arr[i][1]+")"+"\n");
                }
            }
        }
    }
    public static void main(String[] args)
    {
        int[][] arr = {{11, 20}, {30, 40}, {5, 10}, {40, 30}, {10, 5}};
        System.out.print("Following pairs have symmetric pairs\n");
        findSymPairs(arr, 5);
    }
}
