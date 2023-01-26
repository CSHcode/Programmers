import java.util.HashSet;
import java.util.Iterator;
class Solution {
    public static int getGCD(int num1, int num2) {
        if(num1%num2==0) {                          
            return num2;                            
        }
        return getGCD(num2, num1%num2);             
    }
    public int solution(int a, int b) {
        int answer=0;
        int bb=b/getGCD(a,b);
        HashSet<Integer> s=new HashSet<Integer>();
        int n=bb;
        for(int i=2; i<=bb; i++) {
				if(n%i==0) {
					s.add(i);
					n/=i;  i--;
                  
				}
			}
        Iterator it2=s.iterator();
        if(b==1 || bb==1) {
            answer=1;
        } else {
            while(it2.hasNext()) {
        	int var=(int)it2.next();
        	if(var==2 || var==5) {
                answer=1;
            } else{
               answer=2;
                break;
            }
        }
        }        
        return answer;
    }
}
