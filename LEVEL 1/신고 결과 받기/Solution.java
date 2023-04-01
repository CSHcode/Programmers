import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        
		HashSet<String> over = new HashSet<String>(Arrays.asList(report));  //중복된 신고 제거
		String[] reportNoOver = over.toArray(new String[over.size()]);      //배열로 변환
		
        //신고 당한사람이 key, 신고한 사람들을 담은 set가 value
		HashMap<String, HashSet<String>> reported = new HashMap<String, HashSet<String>>();  
		
		for(int i=0; i<id_list.length; i++) {                               //먼저 key와 빈 set를 넣음
			reported.put(id_list[i], new HashSet<String>());
		}
		
        for(int i=0; i<reportNoOver.length; i++) {                          //신고 당한 사람을 key로 찾아서 set에 신고한사람을 저장
        	reported.get(reportNoOver[i].split(" ")[1]).add(reportNoOver[i].split(" ")[0]); 
        }
        
        HashMap<String, Integer> list = new HashMap<String, Integer>();     //answer배열에 저장할때 쓸 단순 매칭 map
        for(int i=0; i<id_list.length; i++) {
        	list.put(id_list[i], i);
        }
		
        for (int i = 0; i < id_list.length; i++) {
            HashSet<String> send = reported.get(id_list[i]);                //i 번째 사람을 신고한 사람들을 저장한 set를 불러옴
            if (send.size() >= k) {                                         //그 set의 크기가 k보다 크면
                for (String name : send) {                                  //set 안에 들어있는 사람들은 처리결과 메일을 하나씩 받으므로
                    answer[list.get(name)]++;                               //+1
                }
            }
        }
        
        return answer;
        
        
    }
}
