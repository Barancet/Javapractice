package hackerrankq;

public class StringPrac {

    public static void main(String[] args){

        String str = "cool nice wow";

        System.out.println(reverseString(str));

    }

    public static String reverseString(String oldString){
        StringBuilder sb = new StringBuilder();
        for(int i = oldString.length()-1;i>=0 ; i--){
           sb = sb.append(oldString.charAt(i));
        }

        return sb.toString();
    }
}
