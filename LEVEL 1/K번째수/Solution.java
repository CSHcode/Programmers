import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];    
        
        for(int i=0; i<commands.length; i++) {      //copyOfRange 사용
			int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
			Arrays.sort(temp);                      //정렬
			answer[i] = temp[commands[i][2]-1];
		}
        return answer;
    }
}
