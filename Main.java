public class Main {
        public static void main(String[] args) {
            String originalString = "hello";
            String reversedString = reverseString(originalString);
            System.out.println("Original: " + originalString);
            System.out.println("Reversed: " + reversedString);
        }

        public static String reverseString(String input) {
            char[] charArray = input.toCharArray();
            int left = 0;
            int right = charArray.length - 1;

            while (left < right) {
                // Обмін символами
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;

                // Збільшення лівого і зменшення правого індексів
                left++;
                right--;
            }

            return new String(charArray);
        }
    public static int countVowels(String input) {
        int count = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (vowels.indexOf(currentChar) != -1) {
                count++;
            }
        }

        return count;
    }
    public static boolean isPalindrome(String input) {
        // Видаляємо пробіли і переводимо все в нижній регістр
        String cleanedString = input.replaceAll("\\s", "").toLowerCase();

        // Перевіряємо, чи є рядок паліндромом
        int left = 0;
        int right = cleanedString.length() - 1;

        while (left < right) {
            if (cleanedString.charAt(left) != cleanedString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
    public static String removeDuplicates(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (result.indexOf(String.valueOf(currentChar)) == -1) {
                result.append(currentChar);
            }
        }
        return result.toString();
    }
    public static String[] stringToWordsArray(String input) {
        return input.split("\\s+");
    }
}



