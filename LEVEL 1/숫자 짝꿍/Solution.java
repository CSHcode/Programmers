import java.util.Arrays;
class Solution {
    public String solution(String X, String Y) {
        int[] xArr = new int[10];
        int[] yArr = new int[10];
        
        for(String s : X.split("")){
            xArr[Integer.parseInt(s)]++;
        }
        
        for(String s : Y.split("")){
            yArr[Integer.parseInt(s)]++;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=9; i>=0; i--){
            while(xArr[i] > 0 && yArr[i] > 0){
                sb.append(i);
                xArr[i]--;
                yArr[i]--;
            }
        }
        
        if(sb.toString().equals("")) return "-1";
        if(sb.toString().substring(0, 1).equals("0")) return "0";
        
        return sb.toString();
    }
}
