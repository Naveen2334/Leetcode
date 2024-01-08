class Solution {
    public int countPoints(String rings) {
        Map<Character, Set<Character>> map = new HashMap<>();

        for(int i=0; i<rings.length(); i++){
           
           if(i % 2 ==1){
               if(!map.containsKey(rings.charAt(i))){
                   map.put(rings.charAt(i) , new HashSet<Character>());
               }
               map.get(rings.charAt(i)).add(rings.charAt(i-1));
           }
        }

          int count =0;
           for(Set<Character> set : map.values()){
               if(set.size()==3){
                   count++;
               }
           }
         return count;
    }
}