class Solution {
    public int solution(int num1, int num2) {
        int a=0;
        if(0<num1 && num1<=100 && 0<num2 && num2<=100) {
            double d=(double)num1/num2*1000;
            a=(int) d;
        }
        return a;
        }
}
