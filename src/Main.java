
public class Main {
    public static void main(String[] args) {
        String text = "0xr@na the !owtab1a%$#@!34";
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
        System.out.println(new String(chars));

    }
}
