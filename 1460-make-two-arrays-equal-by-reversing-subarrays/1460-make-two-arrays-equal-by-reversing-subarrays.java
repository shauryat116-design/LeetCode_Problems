class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer , Integer> map = new HashMap<>();
         HashMap<Integer , Integer> map2 = new HashMap<>();
        for(int num : target){
            map.put(num , map.getOrDefault(num ,0)+1);
        }

         for(int num : arr){
            map2.put(num , map2.getOrDefault(num ,0)+1);
        }

      if( map.equals(map2)) {
        return true;
      }
      return false;
    }
}