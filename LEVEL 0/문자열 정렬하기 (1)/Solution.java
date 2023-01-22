import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
class Solution {
    public ArrayList<Integer> solution(String my_string) {
    	ArrayList<Integer> arr=new ArrayList<Integer>();                //정수만 골라서 넣고 나중에 정렬하기 편하게 arraylist
      
      for(int i=0; i<my_string.length(); i++) {
    	  if(Pattern.matches("[0-9]+", my_string.substring(i, i+1))) {  //변수로 들어온 String의 i번째 문자가 숫자면
    		  arr.add(Integer.parseInt(my_string.substring(i, i+1)));   //arraylist 에 저장
    	  }
      }
      Collections.sort(arr);                                            //오름차순으로 sort
      return arr;
      }
}
