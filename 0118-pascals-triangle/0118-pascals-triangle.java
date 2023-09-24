class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) return result;
        if (numRows >= 1) result.add(Arrays.asList(1));
        if (numRows >= 2) result.add(Arrays.asList(1, 1));

        for (int row = 2; row < numRows; row++) {
            List<Integer> list = new ArrayList<>(Arrays.asList(1, 1));
            List<Integer> lastRow = result.get(row - 1);
            int end = row - 1;
            for (int i = 1; i <= end; i++) {
                list.add(i, lastRow.get(i) + lastRow.get(i - 1));
            }
            result.add(list);
        }
        return result;
    }
}