package StackandQueueHashMap;

import java.util.ArrayList;
import java.util.Stack;

public class stokSpan {
    public static void main(String[] args) {
        int[] stock = {100, 80, 60, 70, 60, 75, 85};
        ArrayList<Integer> span = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        
        
        for (int i = 0; i < stock.length; i++) {
            int count = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (stock[j] <= stock[i]) {
                    count++;
                } else {
                    break;
                }
            }
            span.add(count);
        }

        System.out.println(span.toString());
    }
}
