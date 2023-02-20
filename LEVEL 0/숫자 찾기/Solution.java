class Solution {
    public int solution(int num, int k) {
        int answer=0;
        for(int i=0; i<(int)(Math.log10(num)+1); i++) {
            if(String.valueOf(num).charAt(i)==String.valueOf(k).charAt(0)) {
                answer=i+1;
                break;
            }
            answer=-1;
        }
        return answer;
    }
}
