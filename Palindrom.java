import java.util.Scanner;
public class Palindrom {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.println("Enter a word: ");
            String word = scanner.nextLine();
            
            boolean isPalindrom = true;
            for (int i = 0; i < word.length() / 2; i++) {
                if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                    isPalindrom = false;
                    break;
                }
            }
            
            if (isPalindrom) {
                System.out.println("The word is a Palindrom.");
            } else {
                System.out.println("The word is not a Palindrom.");
            }
        }
    }
}