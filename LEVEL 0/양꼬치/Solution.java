class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int free=n/10;
        answer=n*12000+(k-free)*2000;
        return answer;
    }
}
