import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] ten = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        ArrayList<Integer> num = (ArrayList<Integer>) Arrays.stream(numbers).boxed().collect(Collectors.toList());
		ArrayList<Integer> t = (ArrayList<Integer>) Arrays.stream(ten).boxed().collect(Collectors.toList());
        
        t.removeAll(num);
        
        for(int i : t){
            answer += i;
        }
        return answer;
    }
}
