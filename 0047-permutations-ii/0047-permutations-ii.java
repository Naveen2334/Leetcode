class Solution {
    
     boolean[] visited;
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> rst = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return rst;
        }
        Arrays.sort(nums);
        int n = nums.length;
        visited = new boolean[n];
        dfs(rst, new ArrayList<>(), nums);
        return rst;
    }
    
    private void dfs(List<List<Integer>> rst, List<Integer> list, int[] nums) {
        if (list.size() == nums.length) {
            rst.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i] || (i - 1 >= 0 && visited[i - 1] && nums[i] == nums[i - 1])) {
                continue;
            }
            visited[i] = true;
            list.add(nums[i]);
            dfs(rst, list, nums);
            visited[i] = false;
            list.remove(list.size() - 1);
        }
    }
}