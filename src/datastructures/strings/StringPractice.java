package datastructures.strings;

public class StringPractice {
    public static void main(String[] args){
        System.out.println(basicReverse("HelloThere"));
        System.out.println(manualReverse("hello"));
    }

    public static String basicReverse(String s){
        return new StringBuilder(s).reverse().toString();
    }

    public static String manualReverse(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = s.length()-1; i >= 0; i-- ){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

}
