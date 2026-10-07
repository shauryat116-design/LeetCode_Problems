class Solution {
    public boolean isGood(int[] nums) {
        HashMap<Integer ,Integer> map = new HashMap<>();
int max = 0;
        for(int i=0; i<nums.length; i++){
            max = Math.max(nums[i] , max);
        }

        for(int num : nums){
            map.put(num , map.getOrDefault(num, 0) + 1);
        }

      
            if(map.get(max) == 2 && map.size() == max){
                for(int num : map.keySet()){
                    if(num != max && map.get(num) !=1)
                    return false;
                }
            return true;
        }
        
        
        return false;
        }
       
    }
