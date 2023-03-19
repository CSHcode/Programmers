class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
      StringBuilder sb = new StringBuilder();               //효율성을 위해 stringbuilder 사용
		for(int i=0; i<ingredient.length; i++) {
			sb.append(ingredient[i]);                       //i번째 재료를 저장
			if(sb.length()>3) {                             //햄버거의 재료가 4개 이상이 모였을경우
				if(sb.charAt(sb.length()-1) == '1' &&       //가장 마지막 재료가 빵이고
				   sb.charAt(sb.length()-2) == '3' &&       //바로전 재료가 고기 이고
				   sb.charAt(sb.length()-3) == '2' &&       //바로전 재료가 야채 이고
				   sb.charAt(sb.length()-4) == '1') {       //바로전 재료가 빵이면
					answer++;                               //answer +1
					sb = new StringBuilder(sb.substring(0, sb.length()-4)); //마지막 4개 재료를 삭제
					}
				}
			}
        return answer;
    }
}
