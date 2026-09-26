class Solution {
    public boolean isAnagram(String s, String t) {
//         if(s.length() != t.length()){
//             return false;
//         }

//         int[] freq = new int[26];
//         for(int i =0; i<s.length(); i++){
//             freq[s.charAt(i) - 'a']++;
//              freq[t.charAt(i) - 'a']--;
             
//         }
//         for(int i : freq){
//             if(i!=0){
//                 return false;
//             }
//         }


// return true;

  HashMap<Character , Integer> map = new HashMap<>();
  HashMap<Character , Integer> map2 = new HashMap<>();
  for(char ch : s.toCharArray()){
   
        map.put(ch , map.getOrDefault(ch , 0) + 1);
   
  }
  for(char ch : t.toCharArray()){
   
        map2.put(ch , map2.getOrDefault(ch , 0) + 1);
    
  }
  return map.equals(map2);
       
 

        
    }
}