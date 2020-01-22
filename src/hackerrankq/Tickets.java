package hackerrankq;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Tickets {
    public static void main(String[] args){
        List<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(6);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(waitingTime(arr, 2 ));
    }
    public static long waitingTime(List<Integer> tickets, int p) {
        // Write your code here
        long count = 0;
        Queue<BigInteger[]> queue = new LinkedList<>();

        for(int i=0; i< tickets.size(); i++){
            BigInteger[] temp = new  BigInteger[2];
            temp[0] = BigInteger.valueOf(i);
            temp[1] = BigInteger.valueOf(tickets.get(i));
            queue.add(temp);
        }
        while(!queue.isEmpty()){
            count++;
            BigInteger[] person = queue.remove();
            BigInteger personIndex = person[0];
            BigInteger ticketsNeeded = person[1].subtract(BigInteger.ONE);
            person[1] = ticketsNeeded;

            if(ticketsNeeded.equals(BigInteger.ZERO)){
                BigInteger position = BigInteger.valueOf(p);

                if(personIndex.equals(position)){
                    break;
                }
            }
            else{
                queue.add(person);
            }
        }
        return count;
    }
}



