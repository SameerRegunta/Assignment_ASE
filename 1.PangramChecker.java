public class PangramChecker {

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = checkIfPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    private static boolean checkIfPangram(String s) {
        s = s.toLowerCase();

        boolean[] alphabetPresence = new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (currentChar >= 'a' && currentChar <= 'z') {
                alphabetPresence[currentChar - 'a'] = true;
            }
        }

        for (boolean isPresent : alphabetPresence) {
            if (!isPresent) {
                return false;
            }
        }

        return true;
    }
}
