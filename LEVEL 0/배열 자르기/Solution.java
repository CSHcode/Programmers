import java.util.Arrays;
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer=Arrays.copyOfRange(numbers, num1, num2+1);     //numbers배열을 num1 부터 num2+1 까지 잘라서 배열이 넣음
        return answer;
    }
}
