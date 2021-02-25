package hackerrankq;

public class TestString {
    public static void main(String[] args)
    {
        String origstr = "Geeks";
        System.out.println(reverseStr(origstr));
    }

    public static String reverseStr(String unrev){
        StringBuilder sbr = new StringBuilder(unrev);
        sbr.reverse();
        return sbr.toString();
    }
}
