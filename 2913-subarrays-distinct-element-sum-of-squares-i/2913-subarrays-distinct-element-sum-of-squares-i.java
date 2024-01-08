class Solution {
    public int sumCounts(List<Integer> nums) {
        Set<Integer> set = new HashSet<>();
        int answer = 0;
        for(int i=0;i<nums.size();i++){
            for(int j=i;j<nums.size();j++){
                set.add(nums.get(j));
                answer += Math.pow(set.size(),2);
            }
            set.clear();
        }
        return answer;
    }
}