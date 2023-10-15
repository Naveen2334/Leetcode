class Solution {
    public int[] decode(int[] encoded, int first) {
        int size = encoded.length;
        int res[] = new int[size+1];
        res[0] = first;
        for(int i= 0 ;i<size;i++)
        {
            res[i+1]= res[i]^encoded[i];
        }
        return res;
    }
}