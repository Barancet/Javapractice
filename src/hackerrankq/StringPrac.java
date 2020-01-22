package hackerrankq;

public class StringPrac {

    public static void main(String[] args){

        String str = "cool bro that is sick";

        System.out.println(reverseString(str));

    }

    public static String reverseString(String oldString){
        String reversedString = "";

        for(int i = oldString.length()-1;i>=0 ; i--){
           reversedString += oldString.charAt(i);
        }

        return reversedString;
    }
}
