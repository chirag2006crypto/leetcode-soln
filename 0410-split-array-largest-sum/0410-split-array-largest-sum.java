class Solution {

    public boolean isValid( int[] arr , long sum , int k ){
        int count = 1 ;
        int cursum = 0 ;
        for( int i = 0 ;i < arr.length ; i++){
            if( cursum + arr[i] <= sum){
                cursum += arr[i];
            }
            else{
                count++;
                cursum = arr[i];
            }
        }
        return count <= k ; 
    }

    public int splitArray(int[] arr , int k) {
        long min = arr[0];
        long max = 0;
        for( int i = 0 ;i  < arr.length ; i++){
            min = Math.max( min , arr[i]);
            max += arr[i];
        }
        int currmax=arr[0];
        if( k == arr.length){
            for(int i=0;i<arr.length;i++){
                currmax=Math.max(arr[i],currmax);
            }
            return currmax;
        }
        
        long ans = -1 ;
        while( min <= max){
            long mid = min + ( max - min ) / 2 ;
            if( isValid( arr , mid , k ) ){
                ans = mid;
                max = mid - 1;
            } 
            else{
                min = mid + 1 ;
            }
        }

        return (int)ans;


    }
}