class Solution {
    public int solution(int[][] sizes) {
        int width = 0;
		int height = 0;
		for(int i=0; i<sizes.length; i++) {
			int max = Math.max(sizes[i][0], sizes[i][1]);
			int min = Math.min(sizes[i][0], sizes[i][1]);
			if(max>width) width = max;
			if(min>height) height = min;
		}
        return width*height;
    }
}
