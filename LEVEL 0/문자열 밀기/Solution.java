class Solution {
    public int solution(String A, String B) {
        int answer=0;
        
        String str=A;
        for(int i=0; i<A.length(); i++) {           //A의 길이만큼만 for문을 돌림
            if(str.equals(B)) {                     //만약 A가 B와 같아지면
                return answer;                      //리턴하고 for문 종료
            }
            String a=str.substring(str.length()-1); //str의 마지막 문자를 
            str=a+str.substring(0, str.length()-1); //str의 제일 처음으로 가져옴
            answer+=1;                              //돌릴때마다 answer에 1을 카운트
        }
        return -1;                                  //A의 길이만큼 돌리고 for문을 빠져나오면 -1리턴
    }
}
