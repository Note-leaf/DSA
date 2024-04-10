public class RemoveDuplicates {
    public static String removeDuplicates(String input) {
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256];
        for (char c : input.toCharArray()) {
            if (!seen[c]) {
                result.append(c);
                seen[c] = true;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "hello";
        System.out.println(removeDuplicates(input));  // Output: helo
    }
}

