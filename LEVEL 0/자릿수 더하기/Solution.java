class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=(int) (Math.log10(n)); i>=0; i--) {     //log를 사용해서 자릿수를 구함
            answer+=n%10;                                 //n을 10으로 나누어 각 자릿수를 answer에 더함
            n/=10;                                        //n을 10으로 나누어 자릿수를 하나씩 줄임
        }
        return answer;
    }
}
