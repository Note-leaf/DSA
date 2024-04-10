public class CheckRotation {
    public static boolean isRotation(String str1, String str2) {
        if (str1.length() != str2.length() || str1.isEmpty()) {
            return false;
        }
        String concatenated = str1 + str1;
        return concatenated.contains(str2);
    }

    public static void main(String[] args) {
        String string1 = "waterbottle";
        String string2 = "erbottlewat";
        System.out.println(isRotation(string1, string2));  // Output: true
    }
}

