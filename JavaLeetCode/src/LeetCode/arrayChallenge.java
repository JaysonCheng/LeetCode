package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class arrayChallenge {

    public static List<Long> arrayChallenge(List<Long> arr) {
        // Write your code here
        List<Long> res = new ArrayList<>();
        res.add((long)0);
        for(int i = 1; i < arr.size(); i++) {
            long counter = 0;
            for(int j = i - 1; j >= 0; j--) {
                if(arr.get(i) < arr.get(j)) {
                    counter -= Math.abs(arr.get(i) - arr.get(j));
                } else if(arr.get(i) >= arr.get(j)) {
                    counter += Math.abs(arr.get(i) - arr.get(j));;
                }
            }
            res.add(counter);
        }
        return res;
    }

    public static void main(String[] args) {
        List<Long> arr = new ArrayList<>();
        arr.add((long)2);
        arr.add((long)1);
        arr.add((long)3);

        List<Long> res = arrayChallenge(arr);
        for(long i : res) {
            System.out.println(i);
        }
    }
}
