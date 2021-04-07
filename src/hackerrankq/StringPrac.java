package hackerrankq;

public class StringPrac {

    public static void main(String[] args) {
        String str = "cool nice wow";
        System.out.println(reverseString(str));
        System.out.println(reverseAnotherString(str));
        System.out.println(stringmerger("bad", "good"));
    }

    public static String reverseString(String oldString) {
        StringBuilder sb = new StringBuilder();
        for (int i = oldString.length() - 1; i >= 0; i--) {
            sb = sb.append(oldString.charAt(i));
        }
        return sb.toString();
    }

    public static String reverseAnotherString(String rev) {
        char[] s = rev.toCharArray();
        int start = 0;
        int end = rev.length() - 1;
        while (start < end) {
            char tmp = s[end];
            s[end] = s[start];
            s[start] = tmp;
            start++;
            end--;
        }
        return new String(s);
    }

    public static String stringmerger(String s1, String s2) {
        StringBuilder result = new StringBuilder();

        int len1 = s1.length();
        int len2 = s2.length();

        for (int i = 0; i < len1 || i < len2; i++) {
            if (i < len1) {
                result.append(s1.charAt(i));
            }
            if (i < len2) {
                result.append(s2.charAt(i));
            }
        }
        return result.toString();
    }
}
