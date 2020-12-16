package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pascalTriangle {

    public static List<List<Integer>> generate(int numRows) {
//        List<List<Integer>> pascalTriangle = new ArrayList<>();
//
//        if(numRows == 0) {
//            return pascalTriangle;
//        }
//
//        List<Integer> firstRow = new ArrayList<>();
//        firstRow.add(1);
//        pascalTriangle.add(firstRow);
//
//        for(int i = 1; i < numRows; i++) {
//            List<Integer> previousRow = new ArrayList<>();
//            previousRow = pascalTriangle.get(i-1);
//            List<Integer> currentRow = new ArrayList<>();
//            currentRow.add(1);
//            for(int j = 1; j < i; j++) {
//                currentRow.add(previousRow.get(j-1) + previousRow.get(j));
//            }
//            currentRow.add(1);
//            pascalTriangle.add(currentRow);
//        }
//
//        return pascalTriangle;
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(numRows == 0) return res;
        if(numRows == 1) {
            res.add(new ArrayList<>(Arrays.asList(1)));
            return res;
        }
        if(numRows == 2) {
            res.add(new ArrayList<>(Arrays.asList(1)));
            res.add(new ArrayList<>(Arrays.asList(1,1)));
            return res;
        }

        res.add(new ArrayList<>(Arrays.asList(1)));
        res.add(new ArrayList<>(Arrays.asList(1,1)));

        int i = 2;
        while(i < numRows) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for(int j = 1; j < i; j++) {
                temp.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
            }
            temp.add(1);
            res.add(temp);
            i++;
        }

        return res;
    }

    public static void main(String[] args) {
        List<List<Integer>> pascalTriangle = generate(5);
        System.out.println(pascalTriangle);
    }
}
