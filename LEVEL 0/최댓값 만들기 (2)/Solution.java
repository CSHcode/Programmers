import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer=0;
        Arrays.sort(numbers);                   //매개변수로 들어온 배열numbers를 정렬
        
        int neg = numbers[0]*numbers[1];        //배열 첫번째와 두번째 수를 곱하여 음수를 곱한 최댓값
        int pos = numbers[numbers.length-1]*numbers[numbers.length-2];  
                                                //배열 마지막과 마지막 전 수를 곱하여 양수를 곱한 최댓값
        if(neg<pos) {
            answer=pos;
        } else {
            answer=neg;
        }
        return answer;
    }
}
