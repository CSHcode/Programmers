import java.util.Arrays;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(reserve);                           //자신보다 +1 or -1 에게만 빌려줄수 있다 하니
		Arrays.sort(lost);                              //일단 정렬하고 시작
                                                           
        for(int i=0; i<reserve.length; i++) {           //여벌이 있는 학생이 도난 당한 경우
				for(int j=0; j<lost.length; j++) {
					if(reserve[i] == lost[j]) {
						reserve[i] = -1;                //여벌을 가져온 i번째 학생의 번호를 -1로 변경
						lost[j] = -1;                   //도난당한 j번째 학생의 번호를 -1로 변경
						break;
					}
				}
			}
        for(int i=0; i<lost.length; i++) {
				for(int j=0; j<reserve.length; j++) {   //만약 도난당한 i번째 학생+1/-1이 여별 학생중 존재할경우
					if(lost[i]-1 == reserve[j] || lost[i]+1 == reserve[j]) {    
						lost[i] = -1;                   //도난당한 i번째 학생의 번호를 -1로 변경
						reserve[j] = -1;                //여별을 가져온 j번째 학생의 번호를 -1로 변경
						break;
					}
				}
			}
        int count = 0;
			for(int i=0; i<lost.length; i++) {
				if(lost[i]!=-1) {                       //lost배열에서 -1이 아니면 빌리지 못한 학생으로 간주
					count++;
				}
			}
        return n-count;
    }
}
