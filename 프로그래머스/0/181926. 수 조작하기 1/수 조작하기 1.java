class Solution {
    public int solution(int n, String control) {
        char[] charArray = control.toCharArray();
        
        for (int i=0; i<charArray.length; i++) {
            if (charArray[i] == 'w')
                n += 1;
            else if (charArray[i] == 's')
                n -= 1;
            else if (charArray[i] == 'd')
                n += 10;
            else if (charArray[i] == 'a')
                n -= 10;
        }
        return n;
    }
}