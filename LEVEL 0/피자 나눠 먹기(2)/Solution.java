class GCD{                                          //최대공약수를 구하는 메소드
	public static int getGCD(int num1, int num2) {
		if(num1%num2==0) {                          //num1을 num2로 나눠서 나머지가0이면
			return num2;                            //최대공약수는 num2
		}
		return getGCD(num2, num1%num2);             //나머지가 있으면 num2와 같이 다시 GCD메소드에 넣음(재귀)
	}
}
class Solution {
    public int solution(int n) {
        int answer = 0;
        int gcd=GCD.getGCD(n, 6);                   //매개변수로 들어온 n과 6의 최대공약수
        int lcm=n*6/gcd;                            //n과 6의 최소공배수(조각수)
        answer=lcm/6;                               //6으로 나눔(피자개수)
        return answer;
    }
}
