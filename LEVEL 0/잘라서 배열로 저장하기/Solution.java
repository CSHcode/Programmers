class Solution {
    public String[] solution(String my_str, int n) {
        int length=(int) Math.ceil((double)my_str.length()/n);  //my_str을 n으로 나누고 올림해서 int에 저장함
        String[] answer=new String[length];                     //길이가 length인 answer배열
        
        int index=0;
		for(int i=0; i<length-1; i++) {                         
			answer[i]=my_str.substring(index, n*(i+1));         //n번째 인덱스까지 잘라서 answer에 저장
			index+=n;
		}
		answer[length-1]=my_str.substring(index);
        
        return answer;
    }
}
