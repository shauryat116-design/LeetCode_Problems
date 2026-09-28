class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
     HashMap<Character, Integer> map = new HashMap<>();
      HashMap<Character , Integer> map2 = new HashMap<>();

                  for(char ch : ransomNote.toCharArray()){
                   map.put(ch , map.getOrDefault(ch , 0) +1);

                 }
                 for(char chh : magazine.toCharArray()){
                   map2.put(chh , map2.getOrDefault(chh , 0) +1);

                 }

                 for(char dh : map.keySet()){
                    if(!map2.containsKey(dh) || map.get(dh) > map2.get(dh)){
                        return false;
                    }
                 }
                         return true;
    
 }
}








        
   