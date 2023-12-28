
//TC = O(n)
//SC = O(n)
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);  //edge case
        int rSum = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i ++)
        {
            if(nums[i] == 0) rSum--;
            else rSum++;
            if(map.containsKey(rSum))
            {
                if(i - map.get(rSum) > max ) max = i - map.get(rSum); 
            }
            else
            {
                map.put(rSum, i);
            }
        }
        return max;
    }
}