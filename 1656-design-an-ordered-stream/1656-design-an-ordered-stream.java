class OrderedStream {
    int index = 1;
    Map<Integer, String> map = new HashMap<>();
    
    public OrderedStream(int n) {
    }
    
    public List<String> insert(int id, String value) {
        map.put(id, value);
        List<String> result = new ArrayList<>();
        while (map.containsKey(index))
            result.add(map.get(index++));
        return result;
    }
}