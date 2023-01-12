class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        int p=(int)Math.ceil( (double)n/slice );
        answer=p;
        return answer;
    }
}
