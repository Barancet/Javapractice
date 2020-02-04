package hackerrankq;

public class ConsecSum {

    public static void main(String[] args) {
        System.out.println(conSum(15));

    }


    public static int conSum(int targetSum){
        int numSetCount = 0;
        int currentSum = 0;
        int cond = (targetSum/2)+2;

        for(int i = 1; i < cond ; i++) {
            int j = i;

            while (currentSum < targetSum){
                currentSum += j++;
            }
            if(currentSum == targetSum){
                numSetCount++;
            }
            currentSum = 0;
        }
        return numSetCount;
        }
    }

