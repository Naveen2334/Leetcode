class Solution {
    public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> rst = new ArrayList<>();
        if (nums == null || nums.length == 0) return rst;
        
        List<Integer> numList = new ArrayList<>();
        for (int num : nums) numList.add(num);
        
        int n = nums.length;
        Queue<List<Integer>> queue = new LinkedList<>();
        queue.offer(new ArrayList<>());

        while (!queue.isEmpty()) {
            List<Integer> list = queue.poll();
            if (list.size() == n) {
                rst.add(new ArrayList<>(list));
                continue;
            }
            List<Integer> candidates = new ArrayList<>(numList);
            candidates.removeAll(list);// the remaining items to insert
            for (int num : candidates) {
                list.add(num);
                queue.offer(new ArrayList<>(list));
                list.remove(list.size() - 1);
            }
        }

        return rst;
    }
}