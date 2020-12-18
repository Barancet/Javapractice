package hackerrankq;

public class StringTrim {
    public static void main(String[] args) {

        String str = "Wo@@@@w did i@@@t remove the && @@ %%";
        System.out.println(trimChar(str));
    }

    public static String trimChar(String s) {
        return s.replaceAll("[.&]|[.@]|[.%]", "");
    }
}
