package homework10;

public class DocumentProcessor {
    public static void main(String[] args) {
        String documentNumber = "1234-abc-5678-def-1a2b";

        System.out.println("First two blocks: " + getFirstTwoBlocks(documentNumber));
        System.out.println("Masked document number: " + maskLetters(documentNumber));
        System.out.println("Letters in format yyy/yyy/y/y: " + getLettersInFormat(documentNumber));
        System.out.println("Letters in upper format: " + getLettersInUpperFormat(documentNumber));
        System.out.println("Contains 'abc': " + containsSequence(documentNumber, "abc"));
        System.out.println("Starts with '555': " + startsWithSequence(documentNumber, "555"));
        System.out.println("Ends with '1a2b': " + endsWithSequence(documentNumber, "1a2b"));
    }

    public static String getFirstTwoBlocks(String documentNumber) {
        String[] parts = documentNumber.split("-");
        return parts[0] + "-" + parts[1];
    }

    public static String maskLetters(String documentNumber) {
        return documentNumber.replaceAll("[a-zA-Z]", "*");
    }

    public static String getLettersInFormat(String documentNumber) {
        String lettersOnly = documentNumber.replaceAll("[^a-zA-Z]", "").toLowerCase();
        return lettersOnly.substring(0, 3) + "/" + lettersOnly.substring(3, 6) + "/" + lettersOnly.charAt(6) + "/" + lettersOnly.charAt(7);
    }

    public static String getLettersInUpperFormat(String documentNumber) {
        StringBuilder sb = new StringBuilder("Letters:");
        for (char ch : documentNumber.toCharArray()) {
            if (Character.isLetter(ch)) {
                sb.append(Character.toUpperCase(ch));
                if (sb.length() == 11 || sb.length() == 15 || sb.length() == 17) {
                    sb.append('/');
                }
            }
        }
        return sb.toString();
    }

    public static boolean containsSequence(String documentNumber, String sequence) {
        return documentNumber.toLowerCase().contains(sequence.toLowerCase());
    }

    public static boolean startsWithSequence(String documentNumber, String sequence) {
        return documentNumber.startsWith(sequence);
    }

    public static boolean endsWithSequence(String documentNumber, String sequence) {
        return documentNumber.endsWith(sequence);
    }
}
