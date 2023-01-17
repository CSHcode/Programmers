import java.util.HashMap;
class Solution {
    public String solution(String rsp) {
        String answer = "";
        HashMap<String, String> hm=new HashMap<String, String>();
        hm.put("0", "5");
        hm.put("2", "0");
        hm.put("5", "2");
        
        for(int i=0; i<rsp.length(); i++) {
        	String s=hm.get(String.valueOf(rsp.charAt(i)));
        	answer+=s;
        }
        return answer;
    }
}
