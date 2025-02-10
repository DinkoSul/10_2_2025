public class Palindrom {
    public static boolean isPalindrom(String word) {
        word = word.toLowerCase().replaceAll(" ", "");
        int index = word.length() - 1;
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(index--)) {
                return false;
            }
        }
        return true;
    }


}
