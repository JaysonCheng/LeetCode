class Solution {
public:
    int reverse(int x) {
        int reverseNum = 0;
        while(x != 0){
            int insert = x % 10;
            if(reverseNum > INT_MAX/10 || (reverseNum == INT_MAX / 10) && insert > 7) return 0;
            if(reverseNum < INT_MIN/10 || (reverseNum == INT_MAX / 10) && insert < -8) return 0;
            reverseNum = reverseNum * 10 + insert;
            x = x / 10;
        }
        return reverseNum;
    }
};