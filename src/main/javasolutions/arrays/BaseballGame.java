package main.javasolutions.arrays;

import java.util.ArrayDeque;
import java.util.Deque;

public class BaseballGame {
    public int calPoints(String[] operations) {
        Deque<Integer> record = new ArrayDeque<>();
        int total = 0;
        for (String s: operations) {
            if (s.equals("C")) {
                record.pop();
            } else if (s.equals("D")) {
                record.push(record.peek() * 2);
            } else if (s.equals("+")) {
                int last = record.pop();
                int secondLast = record.peek();
                record.push(last);
                record.push(last + secondLast);
            } else {
                record.push(Integer.parseInt(s));
            }
        }
        for (int score : record) {
            total += score;
        }
        return total;
    }
}
