package hackerrankq;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Tickets2 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(6);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        System.out.println(waitingTime(arr, 2));
    }

    public static long waitingTime(List<Integer> tickets, int p) {
        // Write your code here
        long count = 0;
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < tickets.size(); i++) {
            int[] temp = {i, tickets.get(i)};
            queue.add(temp);
        }
        while (!queue.isEmpty()) {
            count++;
            int[] person = queue.remove();
            int personIndex = person[0];
            int ticketsNeeded = --person[1];

            if (ticketsNeeded == 0) {
                if (personIndex == p) {
                    break;
                }
            } else {
                queue.add(person);
            }
        }
        return count;
    }
}



