class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Character> map = new HashMap<>();
        int temp=0;
        for(int i=0 ; i<key.length(); i++){
            if(key.charAt(i)==' '||map.containsKey(key.charAt(i))){
            temp++;
            continue;
            }
            map.put(key.charAt(i),(char)('a'+i-temp));
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<message.length(); i++){
            if(message.charAt(i)==' '){
                sb.append(" ");
                continue;
        }
            char val = message.charAt(i);
            sb.append(map.get(val));
        }
        return sb.toString();
    }
}