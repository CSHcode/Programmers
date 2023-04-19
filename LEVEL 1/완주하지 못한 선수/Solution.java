import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";                                 //효율성 테스트가 있으니 중간에 break를 
                                                            //해야한다는 생각을 하고 시작
        Arrays.sort(participant);                           //두 배열은 한곳만 빼고 전부다 같기 때문에     
        Arrays.sort(completion);                            //정렬을 하면 한부분만 빼고 완전히 같은 배열
        
        for(int i=0; i<completion.length; i++) {   
            if(!participant[i].equals(completion[i])) {     //두 배열의 i번째 이름을 비교했을때 다르면
                answer = participant[i];                    //완주하지 못한 사람의 이름
                break;
            }
        }
    
        return answer;
    }
}
