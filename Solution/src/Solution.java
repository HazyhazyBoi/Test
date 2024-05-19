import java.util.Arrays;
import java.util.Comparator;

public class Solution {

    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int i = 0 ; i <answer.length ; i++) {

//        	answer[i] = n;
//        	answer[i+1] = n+n; 		
//        	answer[i+1+1] = n+n+n; 		

        	answer[i] = (long)x*(i+1);
        	
        }
        return answer;
    }
    
    public static void main(String[] args) {
		System.out.println(new Solution().solution(2,3));
	}
}
