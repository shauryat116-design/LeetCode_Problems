class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num , map.getOrDefault(num , 0) + 1);
        }
        int a =0; 
        for(int num : map.keySet()){
             if(map.get(num) == 2){
                  a = num;
                }
            }
            int missing =0;
        for(int i=1; i<=nums.length; i++){
            if(!map.containsKey(i)){
               missing = i;
            }
        }
        return new int[]{a , missing};
        }
    }
