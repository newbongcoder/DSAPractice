class DSA011 {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int result=0;
        for(int i = 0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                result=nums[i];
                break;
            }
        }
        return result;
    }
}
