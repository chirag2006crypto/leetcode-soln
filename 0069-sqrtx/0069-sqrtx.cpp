class Solution {
public:
    int mySqrt(int x) {
        long long low = 0;
        long long hi = x;
        while(low<= hi){
            long long mid = low +(hi-low)/2;
            if(mid*mid== x){
                return mid;
                break;

            }
            else if( mid*mid< x){
                low = mid +1;

            }
            else{
                hi= mid-1;

            }

        }
        return low-1;
    }
};