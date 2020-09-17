package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class pascalTriangle2Recursive {

    // 0ms runtime with O(n)
    public static List<Integer> getRow(int rowIndex) {
        // Base case
        if(rowIndex == 0) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            return row;
        }

        List<Integer> prevRow = getRow(rowIndex - 1);
        List<Integer> currRow = new ArrayList<>();

        currRow.add(1);
        for(int j = 1; j < rowIndex; j++) {
            currRow.add(prevRow.get(j-1) + prevRow.get(j));
        }
        currRow.add(1);

        return currRow;
    }

    public static void main(String[] args) {
        List<Integer> row = getRow(3);
        System.out.println(row);
    }
}
