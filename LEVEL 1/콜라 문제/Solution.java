class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int current = n;                //현재 소지하고 있는 총 병의 수
		loop : while (current > 1) {    
			int temp = 0;               //
			
			while (current >= a) {      //현재 갖고있는 병의 수가 마트에서 바꿔주는 병의 수보다 같거나 많으면
				current -= a;           //현재 병 수에서 a 만큼 빼주고
				temp+=b;                //교환 할때마다 b개의 콜라를 주니 현재 병수에 더함
				answer+=b;              //최종 답에 더함
			}
			current += temp;            //총 교환받은 병수를 현재 병수에 더함
            if (current < a) {
				break loop;
			}
		}
        return answer;
    }
}
