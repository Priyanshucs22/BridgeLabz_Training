public class SentenceFormatter {

    public static String formatParagraph(String paragraph) {

        if (paragraph == null || paragraph.trim().isEmpty()) {
            return "";
        }

        // Remove extra spaces at beginning and end
        paragraph = paragraph.trim();

        // Ensure one space after punctuation
        paragraph = paragraph.replaceAll("\\s*([.!?])\\s*", "$1 ");

        // Split sentences
        String[] sentences = paragraph.split("(?<=[.!?])\\s+");

        StringBuilder result = new StringBuilder();

        for (String sentence : sentences) {
            sentence = sentence.trim();
            if (!sentence.isEmpty()) {
                result.append(Character.toUpperCase(sentence.charAt(0)))
                      .append(sentence.substring(1))
                      .append(" ");
            }
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        String input = "  hello   world!this is   a test. how are you? ";

        System.out.println("Formatted Text:");
        System.out.println(formatParagraph(input));
    }
}
