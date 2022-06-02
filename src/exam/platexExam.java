package exam;

import java.util.Arrays;

public class platexExam {
	 public int solution (int[] A, int[] B) {
		 Arrays.sort(A);
		 Arrays.sort(B);
		 int answer = 0;	 
		 int a = A.length-1;
		 int b = B.length-1;
		 while(0<=a && 0<=b){
			 if(A[a]<B[b]) {
				 answer++;
			 }

	        }
		 return answer;
	 }

}
