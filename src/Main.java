import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner txt = new Scanner(System.in);
        System.out.println("Input: ");
        String text = txt.nextLine();
        if (text.trim().isEmpty()) {
            System.out.println("Ошибка: строка пустая");
        }
        reverse(text);
        String out = reverse(text);
        System.out.println("Output: " + out);
    }
    public static String reverse(String text) {
        char[] chars = text.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            if (Character.isLetter(chars[left]) && Character.isLetter(chars[right])) {
                char tmp = chars[left];
                chars[left] = chars[right];
                chars[right] = tmp;
                left++;
                right--;
            } else if (Character.isLetter(chars[left]) && !Character.isLetter(chars[right])) {
                right--;
            } else if (!Character.isLetter(chars[left]) && Character.isLetter(chars[right])) {
                left++;
            } else {
                left++;
                right--;
            }
        }
        String result = new String(chars);
        return result;
    }
}
