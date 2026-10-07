class Solution {
    public int minimizedStringLength(String s) {
        HashMap<Character , Integer> map = new HashMap<>();

        for(char num : s.toCharArray()){
            map.put(num , map.getOrDefault(num , 0) + 1);
        }
int count= 0;
        for(char num : map.keySet()){
            count++;
        }
        return count;
    }
}