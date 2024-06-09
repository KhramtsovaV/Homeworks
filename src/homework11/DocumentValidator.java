package homework11;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DocumentValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> uniqueDocuments = new HashSet<>();
        String input;

        System.out.println("Enter document number  (for end print 'exit'):");

        while (true) {
            input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            if (!uniqueDocuments.contains(input)) {
                uniqueDocuments.add(input);
                String validationMessage = validateDocumentNumber(input);
                System.out.println("Document number: " + input + " - " + validationMessage);
            } else {
                System.out.println("Document number: " + input + " - already entered, skip the check.");
            }
        }

        scanner.close();
    }

    public static String validateDocumentNumber(String documentNumber) {
        if (documentNumber.length() != 15) {
            return  "not valid - the length of the document number must be 15 characters.";
        }

        if (!(documentNumber.startsWith("docnum") || documentNumber.startsWith("kontract"))) {
            return "not valid - must start with'docnum' или 'kontract'.";
        }

        return "valid.";
    }
}
