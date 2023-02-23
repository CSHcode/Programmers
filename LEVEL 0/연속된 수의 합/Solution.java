class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];        //길이가 num인 answer배열
        
        int nSum = num * (1 + num) / 2;     //
        int start = (total - nSum) / num;

        for(int i=1; i<num+1; i++){
                answer[i - 1] = i + start;
        }
        
        return answer;
        
    }
}
