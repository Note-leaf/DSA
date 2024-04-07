import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {
    public static Map<Character, Integer> countCharacters(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }
        return charCountMap;
    }

    public static void main(String[] args) {
        String str = "hello world";
        Map<Character, Integer> charCounts = countCharacters(str);
        System.out.println("Character counts:");
        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
