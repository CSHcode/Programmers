class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int even=0;                                 //짝수를 담을 even
        int odd=0;                                  //홀수를 담을 odd
        for(int i=0; i<num_list.length; i++) {
            if(num_list[i]%2==0) {                  //짝수면 
                even++;                             //even +1
            } else {                                //홀수면 
                odd++;                              //odd +1
            }
        }
        answer[0]=even;
        answer[1]=odd;
        return answer;
    }
}
