package CodeCamp;
public class CodeCamp1 {
		 
		 public int checkPair(int Array[], int size, int sum) {
		      for (int i = 0; i < (size - 1); i++) {
		          for (int j = (i + 1); j < size; j++) {
		              if (Array[i] + Array[j] == sum) {
		            	  System.out.println("Pair that sums up to " + sum +
		                          " is " + Array[i] + " and " + Array[j]);
		                  return 1;
		              }
		          }
		      }
		 
		      return -1;
		  }
}
		 
		  

