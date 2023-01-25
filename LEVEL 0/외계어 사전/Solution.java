class Solution {
    public int solution(String[] spell, String[] dic) {
    	int answer=0;
        for(int i=0; i<dic.length; i++) {
        	int check=0;
        	for(int j=0; j<spell.length; j++) {
        		if(dic[i].indexOf(spell[j])==-1) {
        			check=-1;
        			answer=2;
        			break;
        		}
        	}
        	if(check==0) {
        		answer=1;
        		break;
        	}
        	
    }
        return answer;
}
}
