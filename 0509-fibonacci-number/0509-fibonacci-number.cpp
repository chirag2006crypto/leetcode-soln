class Solution {
public:
    int fib(int n) {
        int sum =0,a=1,b=1;
        if(n==0) return 0;
        for(int i=2;i<=n;i++){
        sum =a+b;
        a=b;
        b=sum;
    }
    return a;
    }
};