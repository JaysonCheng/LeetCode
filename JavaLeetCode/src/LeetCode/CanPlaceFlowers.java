package LeetCode;

public class CanPlaceFlowers {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        if(n == 0) {
            return true;
        }

        if(flowerbed.length == 1) {
            if(flowerbed[0] == 0) {
                return true;
            } else {
                return false;
            }
        }

        for(int i = 0; i < flowerbed.length; i++) {
            if(flowerbed[i] == 1 && i < flowerbed.length - 2) {
                i+=1;
                continue;
            }
            if(i == 0 && flowerbed[i] == 0) {
                if(flowerbed[i+1] == 0) {
                    count++;
                    flowerbed[i] = 1;
                    i+=1;
                }
            }
            if(i == flowerbed.length - 1 && flowerbed[flowerbed.length - 1] == 0) {
                if(flowerbed[i-1] == 0) {
                    count++;
                    flowerbed[i] = 1;
                }
            }
            if(i > 0 && i < flowerbed.length - 1 && flowerbed[i] == 0) {
                if(flowerbed[i-1] == 0 && flowerbed[i+1] == 0) {
                    count++;
                    flowerbed[i] = 1;
                }
            }
        }
        if(count >= n) return true;

        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 1,0,0,0,0 };
        boolean res = canPlaceFlowers(nums, 1);
        System.out.println(res);
    }
}
