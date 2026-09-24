class Solution {
    public int minOperations(int[] nums, int x) {
       int n=nums.length;
       int left=0;
       long totalSum=0;
       for(int num:nums){
          totalSum+=num;
       }
       
       totalSum-=x;
       if(totalSum<0)return -1;
       if(totalSum==0)return n;
       long sum=0;
       int res=0;
       for(int right=0;right<n;right++){
          sum+=nums[right];

          while(sum>totalSum){
             sum-=nums[left];
             left++;
          }
          if(sum==totalSum){
            res=Math.max(res,right-left+1);
          }
       }
       return res==0?-1:n-res;
    }
}