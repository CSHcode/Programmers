import java.math.BigInteger;                                      //int의 범위를 넘는 수가 나오므로 biginteger 사용
class Solution {
  public BigInteger solution(int balls, int share) {
		
		return fac(balls).divide((fac(balls-share).multiply(fac(share))));
	}
	
	public BigInteger fac(int num) {
        BigInteger big=new BigInteger("1");
		for(int i=1; i<=num; i++) {
			big=big.multiply(new BigInteger(Integer.toString(i)));
		}
		return big;
    }

}
