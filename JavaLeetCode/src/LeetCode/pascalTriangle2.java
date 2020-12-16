package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class pascalTriangle2 {

    public static List<Integer> getRow(int rowIndex) {
        //recursive 100%
        List<Integer> currRow = new ArrayList<>();
        if(rowIndex == 0) {
            currRow.add(1);
            return currRow;
        }

        List<Integer> prevRow = getRow(rowIndex - 1);
        currRow.add(1);
        for(int i = 1; i < rowIndex; i++) {
            currRow.add(prevRow.get(i-1) + prevRow.get(i));
        }
        currRow.add(1);

        return currRow;

        // 1ms runtime with O(n^2)
//        List<Integer> row = new ArrayList<>();
//        row.add(1);
//
//        for(int i = 1; i <= rowIndex; i++) {
//            List<Integer> previousRow = new ArrayList<>(row);
//            row.clear();
//            row.add(1);
//            for(int j = 1; j < i; j++) {
//                row.add(previousRow.get(j-1) + previousRow.get(j));
//            }
//            row.add(1);
//        }
//
//        return row;

        // least memeory
//        List<Integer> res = new ArrayList<>();
//        if(rowIndex == 0) {
//            res.add(1);
//            return res;
//        }
//        if(rowIndex == 1) {
//            res.add(1);
//            res.add(1);
//            return res;
//        }
//
//        res.add(1);
//        res.add(1);
//
//        int i = 2;
//        while(i <= rowIndex) {
//            List<Integer> prevRow = new ArrayList<>(res);
//            res.clear();
//            res.add(1);
//            for(int j = 1; j < i; j++) {
//                res.add(prevRow.get(j-1) + prevRow.get(j));
//            }
//            res.add(1);
//            i++;
//        }
//
//        return res;
    }

    public static void main(String[] args) {
        List<Integer> row = getRow(3);
        System.out.println(row);
    }
}
