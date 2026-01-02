public class ParagraphAnalyzer {

    // Count number of words
    public static int countWords(String paragraph) {
        if (paragraph == null || paragraph.trim().isEmpty()) {
            return 0;
        }
        return paragraph.trim().split("\\s+").length;
    }

    // Find longest word
    public static String longestWord(String paragraph) {
        if (paragraph == null || paragraph.trim().isEmpty()) {
            return "";
        }

        String[] words = paragraph.trim().split("\\s+");
        String longest = "";

        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", "");
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    // Replace word (case-insensitive)
    public static String replaceWord(String paragraph, String oldWord, String newWord) {
        if (paragraph == null || paragraph.trim().isEmpty()) {
            return "";
        }
        return paragraph.replaceAll("(?i)\\b" + oldWord + "\\b", newWord);
    }

    public static void main(String[] args) {
        String text = "This is a Test. This test is simple.";

        System.out.println("Word Count: " + countWords(text));
        System.out.println("Longest Word: " + longestWord(text));
        System.out.println("After Replacement:");
        System.out.println(replaceWord(text, "test", "demo"));
    }
}
