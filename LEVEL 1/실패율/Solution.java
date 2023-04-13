import java.util.Arrays;
import java.util.Collections;
import java.util.stream.DoubleStream;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] diff = new double[N];                  //각 스테이지의 난이도를 담을 배열
        String[] stagesS = new String[stages.length];   //frequency를 사용하기 위해 String을 담을 배열
        
        for (int i = 0; i < stages.length; i++) {       //stages배열을 String배열로 변환
			stagesS[i] = String.valueOf(stages[i]);
		}

		int player = stages.length;                     //전체 플레이어 수
		for (int i = 1; i <= N; i++) {                                                   //i번째 스테이지를 도전하고있는
			int freq = Collections.frequency(Arrays.asList(stagesS), String.valueOf(i)); //플레이어수 
			if (freq == 0) {                            //플레이어수가 0이면
				diff[i - 1] = 0;                        //해당 스테이지 난이도는 0
			} else {
				diff[i - 1] = (double) freq / player;   //도전하고있는 플레이어수/전체플레이어수 로 난이도를 구함
				player -= freq;                         //남겨진 플레이어수는 뺌
			}
		}
		
		Double[] diffTemp = DoubleStream.of(diff).boxed().toArray(Double[]::new);   //내림차순으로 정렬
		Arrays.sort(diffTemp, Collections.reverseOrder());

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (diffTemp[i] == diff[j]) {   
					answer[i] = j + 1;
					diff[j] = -1;
					break;
				}
			}
		}
        return answer;
    }
}
