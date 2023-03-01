import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {   //문자열들이 공백과 "." 로 나누어져 있다고 하니 split 사용을 염두
        HashMap<String, String> termsMap = new HashMap<String, String>();       //약관종류가 key, 유효기간이 value 인 hashmap
        for(int i=0; i<terms.length; i++) {
			String[] temp = terms[i].split(" ");
			termsMap.put(temp[0], temp[1]);
		}
        
        String[] todaySplit = today.split("\\.");                               //오늘 날짜를 "."을 기준으로 split 하고 
		int todayDays = Integer.parseInt(todaySplit[0])*12*28                   //년/월/일 에 따라 총 일 수를 구함
            + Integer.parseInt(todaySplit[1])*28 + Integer.parseInt(todaySplit[2]);
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0; i<privacies.length; i++) {
			String[] split = privacies[i].split(" ");                           //공백을 기준으로 split 하여 날짜와 약관 종류를 나눔
			String[] privSplit = split[0].split("\\.");                         //날짜를 다시 "."기준으로 split
			int privDays = Integer.parseInt(privSplit[0])*12*28                 //동일하게 총 일 수를 구하고
                + Integer.parseInt(privSplit[1])*28 + Integer.parseInt(privSplit[2]);
			if(todayDays - privDays >= Integer.parseInt(termsMap.get(split[1]))*28) {   //일 수 차가 약관 종류의 유효기간보다 크면
				arr.add(i+1);                                                   //번호 추가
			}
		}
		
		Integer[] solution = arr.toArray(new Integer[arr.size()]);
		int answer[] = Arrays.stream(solution).mapToInt(Integer::intValue).toArray();
		Arrays.sort(answer);
        return answer;
    }
}
