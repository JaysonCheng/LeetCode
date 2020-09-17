package LeetCode;

public class mergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int endArray = nums1.length - 1;
        int ptr1 = m - 1;
        int ptr2 = n - 1;
        while(ptr1 >= 0 && ptr2 >= 0) {
            if(nums1[ptr1] > nums2[ptr2]) {
                nums1[endArray] = nums1[ptr1];
                ptr1--;
            } else {
                nums1[endArray] = nums2[ptr2];
                ptr2--;
            }
            endArray--;
        }

        while(ptr2 >= 0) {
            nums1[endArray] = nums2[ptr2];
            ptr2--;
            endArray--;
        }
    }
}
