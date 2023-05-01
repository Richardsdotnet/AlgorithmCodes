package algorithm;

public class LongestCommonPrefix {

    public static String longestCommonPre(String[] letters) {
                if (letters.length == 0) return "";
                String prefix = letters[0];
                for (int i = 1; i < letters.length; i++)
                    while (letters[i].indexOf(prefix) != 0) {
                        prefix = prefix.substring(0, prefix.length() - 1);
                        if (prefix.isEmpty()) return "";
                    }
                return prefix;
            }



    public static void main(String[] args) {
        String [] words = {"leetcode", "leet", "lease"};
        System.out.println(longestCommonPre(words));
    }
}