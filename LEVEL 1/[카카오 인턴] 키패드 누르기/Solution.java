import java.util.stream.IntStream;
class Solution {
    public static String solution(int[] numbers, String hand) {
		int[] lef = {1, 4, 7};                      //왼손만 누를수 있는 버튼
		int[] rig = {3, 6, 9};                      //오른손만 눌르수 있는 버튼
		String answer = "";
        
        for(int i=0; i<numbers.length; i++) {       //필자가 만든 알고리즘상
			if(numbers[i] == 0) {                   //0을 11로 인식해야해서 
				numbers[i] = 11;                    //0을 11로 변경
			}
		}
		
		int lefLoc = 10;                            //왼손의 최초 위치는 * 이고 이를 10으로 인식
		int rigLoc = 12;                            //오른손의 최초 위치는 # 이고 이를 12로 인식
		for(int i=0; i<numbers.length; i++) {
			int n = numbers[i];                     //i번쨰 누르고자 하는 버튼 n
			if(IntStream.of(lef).anyMatch(x -> x == n)) {   //n이 lef의 원소일경우
				answer += "L";                              //answer에 L 을 추가
				lefLoc = numbers[i];                        //왼손의 현재 위치 변경
			}else if(IntStream.of(rig).anyMatch(x -> x == n)) { //n이 rig의 원소일경우
				answer+="R";                                //answer에 R 을 추가
				rigLoc = numbers[i];                        //오른손의 현재 위치 변경
			}else {                                 //누르고자 하는 버튼이 중앙에 위치한 버튼일경우
				int toLef = Math.abs(numbers[i]-lefLoc)/3 + Math.abs(numbers[i]-lefLoc)%3;  //왼손위치까지의 거리    
				int toRig = Math.abs(numbers[i]-rigLoc)/3 + Math.abs(numbers[i]-rigLoc)%3;  //오른손위치까지의 거리
				if(toLef < toRig) {         //오른손위치까지가 더 멀면
					answer += "L";          //L 을 추가
					lefLoc = numbers[i];    //왼손의 현재 위치 변경
				}else if(toLef > toRig) {   //왼손위치까지가 더 멀면
					answer += "R";          //R 을 추가
					rigLoc = numbers[i];    //오른손 현재 위치 변경
				}else {                     //왼손/오른손 까진의 거리가 같으면
					if(hand.equals("right")) {  //오른손잡이일 경우
						answer += "R";
						rigLoc = numbers[i];
					}else {                     //왼손잡이일 경우
						answer += "L";
						lefLoc = numbers[i];
					}
				}
			}
		}
		return answer;
	}
}
