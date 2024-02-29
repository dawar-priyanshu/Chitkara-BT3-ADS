class Solution {
    public int longestSubarray(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                c++;
            }
        }
        if(c<=1){
            return nums.length-1;
        }
        int ans=0;
        int i=0;
        int z=0;
        int j=0;
        while(i<nums.length){
            while(i<nums.length && z<=1){
                ans=Math.max(i-j-1,ans);
                if(nums[i]==0){
                    z++;
                }
                i++;
            }
            while(j<nums.length && j<=i && z!=1){
                if(nums[j]==0){
                    z--;
                }
                j++;
            }
            ans=Math.max(ans,i-j-1);
        }
        return ans;
    }
}
