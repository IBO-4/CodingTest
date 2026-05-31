import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<Integer>();
        for (int i=0; i<arr.length;) {
            if (stk.size() == 0) {
                stk.add(arr[i]);
                i++;
            }
            else {
                int last = stk.get(stk.size() - 1);
                if (last < arr[i]) {
                    stk.add(arr[i]);
                    i++;
                } 
                else {
                    stk.remove(stk.size() - 1);
                }
           
            }
        }
        int[] answer = new int[stk.size()];
        for (int j = 0; j < stk.size(); j++) {
            answer[j] = stk.get(j);
        }
        return answer;
    }
}