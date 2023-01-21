class Solution {
    public int div(int n) {             //매개변수 n으로 들어온 정수의 약수의 개수를 구하는 메소드
        int count=0;
        for(int i=1; i<=n; i++) {
            if(n%i==0) {
                count++;
            }
        }
        return count;
    }
    
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++) {
            if(div(i)!=2 && div(i)!=1) {    //약수의 개수가 2가 아니거나, n이 1이 아니면 answer에 1을 더함
                answer++;
            }
        }
        return answer;
    }
}
