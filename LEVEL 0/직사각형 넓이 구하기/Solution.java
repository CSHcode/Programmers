import java.util.ArrayList;
import java.util.HashSet;
class Solution {                                //조건이 x축, y축과 평행한 직사각형이므로 x좌표와 y좌표는 각각 두개씩
     public int solution(int[][] dots) {
        int answer = 0;
        HashSet<Integer> xc=new HashSet<Integer>();     //x좌표를 담을 set       
        for(int i=0; i<4; i++) {
        	xc.add(dots[i][0]);
        }
        ArrayList<Integer> arr1=new ArrayList<Integer>(xc);
        int x1=arr1.get(0);                             //첫번째 x좌표
        int x2=arr1.get(1);                             //두번째 x좌표
         
        HashSet<Integer> yc=new HashSet<Integer>();        //y좌표를 담을 set
        for(int i=0; i<4; i++) {
        	yc.add(dots[i][1]);
        }
        ArrayList<Integer> arr2=new ArrayList<Integer>(yc);
        int y1=arr2.get(0);                              //첫번째 y좌표
        int y2=arr2.get(1);                              //두번째 y좌표
        
        answer=Math.abs((x1-x2)*(y1-y2));
        
        return answer;
    }
}
