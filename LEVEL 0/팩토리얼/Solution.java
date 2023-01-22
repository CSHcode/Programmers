class Solution {
    public static int fac(int n) {      //팩토리얼을 구해주는 메소드
		    if(n==1) return 1;          //매개변수로 들어온 정수가 1이면 1을 리턴
		    return n*fac(n-1);          //매개변수로 들어온 정수에 1을 빼고 다시 메소드에 넣음(재귀), 1이 될때까지 계속 넣음
	    }
    
    public int solution(int n) {  
         int answer=0;
        for(int i=10; i>0; i--) {       //문제 제한사항의 최대값이 10팩토리얼이므로 10부터 1씩 감소
            if(fac(i)<=n) {             //매개변수로 들어온 n 보다 작아지는 순간이 오면 리턴
                answer=i;
                break;
            }
        }
        return answer;
    } 
}
