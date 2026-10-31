
public class Main {
    public static void main(String[] args) {
        String text = "0xr@na the !owtab1a%$#@!34";
        char[] chars = text.toCharArray();
        int left = 0;
        int right = chars.length - 1;
            while (left < right) {
                char tmp = chars[left];     // меняем местами края
                chars[left] = chars[right];
                chars[right] = tmp;
                left++;                     // сдвигаем указатели навстречу
                right--;
            }
            System.out.println(new String(chars));
        }
}