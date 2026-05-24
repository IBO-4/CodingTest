class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        
        int last = num_list.length - 1;
        int prev = num_list.length - 2;
        
        if (num_list[last] > num_list[prev]) {
            answer[answer.length - 1] = num_list[last] - num_list[prev];
        } else {
            answer[answer.length - 1] = num_list[last] * 2;
        }
        
        return answer;
    }
}