class Solution {
    public static int solution(int n) {
        int answer = 0;
        int p=(int) Math.ceil((double)n/7);     //매개변수로 들어온 n을 7로 나누고 올림
        answer=p;
        return answer;
    }
}
