class Solution {
    public int solution(int num1, int num2) {
        int result=0;                                               //리턴값용 정수
        while(0<=num1 && num1<=10000 && 0<=num2 && num2<=10000) {
            if(num1==num2) {                                        //만약 두개의 매개변수가 같은 값이면
                result=1; break;                                    //result에 1을 입력하고 while문 탈출
            } else if(num1!=num2) {                                 //만약 두개의 매개변수가 다른 값이면
                result=-1; break;                                   //reusult에 -1을 입력하고 while문 탈출
            }
        }
        return result;
    }
}
