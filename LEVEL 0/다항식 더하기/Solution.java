class Solution {
    public String solution(String polynomial) {
        String answer="";
        String[] split=polynomial.split("\\s\\+\\s");       //매개변수로 들어온 다항식을 전부 쪼깨서 배열에 넣음
        int con=0;                                          //상수를 넣을 변수 con
        int unk=0;                                          //미지수x 의 계수를 더할 unk
        for(int i=0; i<split.length; i++) {
        	if(split[i].matches("^[0-9]+$")) {              //만약 배열의 i번째 값이 정수면
        		con+=Integer.parseInt(split[i]);            //con 에 더함
        	} else if(split[i].equals("x")) {               //만약 배열의 i번째 값이 x 이면
        		unk+=1;                                     //unk에 1을 더함
        	} else if(split[i].contains("x")) {             //만약 배열의 i번째 값이 x를 포함하면
        		unk+=Integer.parseInt(split[i].substring(0, split[i].length()-1));  //x의 계수만 unk에 더함
        	}
        }
        
        if(unk!=0 && con==0) {          //만약 상수가 0 이고
        	if(unk==1) answer="x";      //미지수 x의 계수가 1이면 그냥 x 만 리턴
        	else answer=unk + "x";      //미지수 x의 계수가 1이 아니면 계수를 붙여서 리턴
        }
        if(unk==0 && con!=0) {          //만약 미지수는 없고 상수만 있으면
        	answer=String.valueOf(con); //상수만 리턴
        }
        if(unk!=0 && con!=0) {                    //만약 상수와 미지수가 있고
        	if(unk==1) answer="x" + " + " + con;  //미지수 x의 계수가 1이면 x+상수 를 리턴
        	else answer=unk + "x" + " + " + con;  //미지수 x의 계수가 1이 아니면 계수x+상수 를 리턴
        }
        return answer;
    }
}
