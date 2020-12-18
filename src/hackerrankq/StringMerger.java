package hackerrankq;

public class StringMerger {


    public static String stringMerger(String s1, String s2) {

        StringBuilder mergedString = new StringBuilder();

        int len1 = s1.length();
        int len2 = s2.length();

        for (int i = 0; i < len1 || i < len2; i++) {

            if (i < len1) {
                mergedString.append(s1.charAt(i));
            }
            if (i < len2) {
                mergedString.append(s2.charAt(i));
            }
        }
        return mergedString.toString();
    }

    public static void main(String[] args) {

        String tester1 = "123";
        String tester2 = "789";

        System.out.println(stringMerger(tester1, tester2));

    }
}
