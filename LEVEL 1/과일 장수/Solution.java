import java.util.Arrays;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Arrays.sort(score);                                    //가장 비싼 과일부터 가져오기 위해 정렬
        for(int i=score.length-1; i>=m-1; i-=m) {              //오름차순으로 정렬했기 때문에 끝에서부터 가져옴
			int[] temp = new int[m];                           //크기가 m 인 배열 
			for(int j=i, l=0; j>i-m; j--, l++) {
				temp[l] = score[j];                            //j번째 과일 가격을 넣음
			}
			int min = Arrays.stream(temp).min().getAsInt();    //그 중 가장 싼 과일 가격
			answer += min * m;
		}
        return answer;
    }
}
