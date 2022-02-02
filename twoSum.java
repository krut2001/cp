class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(target-nums[i])){
                arr[0]=i;
                arr[1]=mp.get(target-nums[i]);
            }
            else{
                mp.put(nums[i],i);
            }
        }
        return arr;
    }
    
}
