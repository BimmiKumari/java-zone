class Solution {
public:
    int findMin(vector<int>& nums) {
        int s=0;
        int e=nums.size()-1;
        int mini=INT_MAX;
        while(s<=e){
            int mid=s+(e-s)/2;
            mini=min(mini,nums[mid]);
            mini=min(mini,nums[s]);
            if(nums[mid]>=nums[s]){
                s=mid+1;
            }
            else{
                e=mid-1;
            }

        }
        return mini;
        
    }
};
