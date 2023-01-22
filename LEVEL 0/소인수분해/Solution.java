import java.util.HashSet;
import java.util.Arrays;
class Solution {
    public int[] solution(int n) {
        HashSet<Integer> s=new HashSet<Integer>();          //중복을 제거하기 위해 set 사용
        int var=n;
        for(int i=2; i<=n; i++) {                           //2부터 매개변수로 들어온 정수n 까지
				if(var%i==0) {                              //var을 i로 나누었을때 나머지가 0이면
					s.add(i);                               //set에 i를 추가하고
					var/=i;                                 //var을 i로 나눔
                    i--;                                    //i--
				}
			}
        Integer[] arr=s.toArray(new Integer[0]);
        return Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
    }
}
