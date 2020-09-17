package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class pascalTriangle2 {

    // 1ms runtime with O(n^2)
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);

        for(int i = 1; i <= rowIndex; i++) {
            List<Integer> previousRow = new ArrayList<>(row);
            row.clear();
            row.add(1);
            for(int j = 1; j < i; j++) {
                row.add(previousRow.get(j-1) + previousRow.get(j));
            }
            row.add(1);
        }

        return row;
    }

    public static void main(String[] args) {
        List<Integer> row = getRow(3);
        System.out.println(row);
    }
}
