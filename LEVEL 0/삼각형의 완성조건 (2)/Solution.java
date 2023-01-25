import java.util.HashSet;
import java.util.Iterator;
class Solution {
    public int solution(int[] sides) {
         int answer = 0;
        HashSet<Integer> s=new HashSet<Integer>();
        
        int max=Math.max(sides[0], sides[1]);       //매개변수로 들어온 삼각형의 두 변중에 큰변을 먼저 찾음
		int abs=Math.abs(sides[0]-sides[1]);
            int i=abs+1;
			while(i<=max) {
				s.add(i);
				i++;
			}
			int j=max;
			while(j<sides[0]+sides[1]) {
				s.add(j);
				j++;
			}
			Iterator<Integer> it=s.iterator();
			while(it.hasNext()) {
				it.next();
				answer+=1;
			}
        return answer;
    }
}
