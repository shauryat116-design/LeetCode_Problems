class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        

//  ArrayList<Integer> arr = new ArrayList<>();
//          for (int i=0; i<nums1.length; i++){         //chexk for common element
//             for(int j=0; j<nums2.length; j++){
//                 if(nums1[i] == nums2[j]){

//                     boolean duplicate = false;
//                     for(int k = 0; k<arr.size(); k++){
//                         if(arr.get(k) == nums1[i]){             // chexk for duplicate and insert in the arraylist.
//                             duplicate = true;
//                             break;
//                         }
//                     }
//                     if(!duplicate){
//                         arr.add(nums1[i]);
//                     }
                    
                    
//                 }
//             }
             
// }

// int [] ans = new int[arr.size()];
// for(int i =0; i<arr.size(); i++){               // arraylist to answer arr  me tranfer.
//     ans[i] = arr.get(i);
// }
// return ans;

      HashMap<Integer  ,Integer> map = new HashMap<>();
       HashMap<Integer  ,Integer> map2 = new HashMap<>();
       ArrayList<Integer> a  =new ArrayList<>();
      for( int num : nums1){
        map.put(num , map.getOrDefault(num , 0)+ 1);
      }
               for( int num : nums2){
        map2.put(num , map2.getOrDefault(num , 0)+ 1);
      }
           for( int num : map.keySet()){
                   if(map2.containsKey(num)){
                       a.add(num);
                   }
           }
           int[] ans = new int[a.size()];
for(int i =0; i<ans.length; i++){
    ans[i] = a.get(i);
}


return ans;


  }
}