class Solution {
    public int[] twoSum(int[] nums, int target) {


       
//         int a=0;
//         int b=0;
//         for(int i=0; i<nums.length; i++){
//             for(int j=0; j<nums.length; j++){
         
//               if((nums[i] + nums[j] == target)  && i!=j ){
//                 a = i;
//                 b =j;
//                break;
//             }
//           }
        
//         }

//     int[] ans = {a,b};
         
          
        




// return ans;

HashMap<Integer , Integer> map = new HashMap<>();
int [] arr = {0, 0};


     for(int i=0; i<nums.length; i++){
        if(map.containsKey(target - nums[i])){
            int a =  map.get(target - nums[i]);
            int [] ans =  {a , i};
            return ans;
        }
        map.put(nums[i] , i);
     }
return arr;







    }
}