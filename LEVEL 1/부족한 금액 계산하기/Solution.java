class Solution {
    public long solution(int price, int money, int count) {
        long tot = 0;                       //총 금액을 담을 tot
		for(int i=1; i<=count; i++) {       
			tot += price * i;               //i번째 이용시 금액을 계속 더함
		}
        
        if(money - tot > 0){                //금액이 충분하면
            return 0;
        }else{                              //금액이 부족하면
            return Math.abs(money - tot);
        }
    }
}
