class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character , Integer> map = new HashMap<>();
          HashMap<Character , Integer> map2 = new HashMap<>();

          for(char ch : s.toCharArray()){
            map.put(ch , map.getOrDefault(ch ,0) + 1);
          }
          for(char ch : t.toCharArray()){
            map2.put(ch , map2.getOrDefault(ch ,0) + 1);
          }
      

              for(char i : map2.keySet()){
                if(!map.containsKey(i))
                          return i;
              
              if(map2.get(i) > map.get(i))
                   return i;
              
      
    }
           return 0;
}
}