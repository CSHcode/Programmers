class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        String[] dartP = dartResult.split("[0-9]+");    //정수를 기준으로 split을 해서 제곱보너스, 상 보너스를 체크
		String[] dartS = dartResult.split("[^0-9]+");   //정수가 아닌 문자를 기준으로 split을 해서 원점수를 체크
        int[] score = new int[4];                       //최종 점수를 저장할 score 배열
		score[0] = 0;
		
		for(int i=1; i<=3; i++) {
			String d = dartP[i];                        //i번째 맞춘 다트의 제곱보너스, 상 보너스를 담은 String
			int s= Integer.parseInt(dartS[i-1]);        //i번째 맞춘 다트의 원점수를 담은 int
			if(d.length() == 1) {						//상 보너스가 없고   			
				if(d.equals("S")) {                     //제곱 보너스가 S
					score[i] = (int) Math.pow(s, 1);
				}else if(d.equals("D")) {               //제곱 보너스가 D
					score[i] = (int) Math.pow(s, 2);
				}else if(d.equals("T")) {               //제곱 보너스가 T
					score[i] = (int) Math.pow(s, 3);
				}
			}else {								        //상 보너스가 있는경우						
				if(d.charAt(1) == 35) {							    //상 보너스가 "#" 이면서	
					if(d.charAt(0) == 83) {                         //제곱 보너스가 S
						score[i] = (int) Math.pow(s, 1)*(-1);       
					}else if(d.charAt(0) == 68) {                   //제곱 보너스가 D
						score[i] = (int) Math.pow(s, 2)*(-1);
					}else if(d.charAt(0) == 84) {                   //제곱 보너스가 T
						score[i] = (int) Math.pow(s, 3)*(-1);
					}
				}else if(d.charAt(1) == 42) {						//상 보너스가 "*" 이면서    	
					if(d.charAt(0) == 83) {                         //제곱 보너스가 S
						score[i-1] = score[i-1]*2;                  //바로 전에 던진 총 점수에 2를 곱함
						score[i] = (int) ((Math.pow(s, 1))*(2));    
					}else if(d.charAt(0) == 68) {                   //제곱 보너스가 D
						score[i-1] = score[i-1]*2;
						score[i] = (int) ((Math.pow(s, 2))*(2));
					}else if(d.charAt(0) == 84) {                   //제곱 보너스가 T
						score[i-1] = score[i-1]*2;
						score[i] = (int) ((Math.pow(s, 3))*(2));
					}
				}
			}
		}
        answer = score[1] + score[2] + score[3];
        return answer;
    }
}
