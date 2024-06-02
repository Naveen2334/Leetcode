class Solution {
    public void reverseString(char[] s) {
       int temp1 = 0;
        int temp2 = s.length - 1;
        while (temp1 < temp2) {
            char temp = s[temp1];
            s[temp1] = s[temp2];
            s[temp2] = temp;
            temp1++;
            temp2--;
        } 
    }
}