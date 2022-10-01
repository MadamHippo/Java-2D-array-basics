public class RowMajor {
	public static void main(String[] args) {
		// Given runner lap data
		double[][] times = {{64.791, 75.972, 68.950, 79.039, 73.006, 74.157}, {67.768, 69.334, 70.450, 67.667, 75.686, 76.298}, {72.653, 77.649, 74.245, 62.121, 63.379, 79.354}};
		
		// Replace the incorrect for loop headers, use the iterators 'outer' and 'inner' for the outer and inner loops
		double runnerTime = 0.0;
		for(int outer = 0; outer < times.length; outer++) {
			runnerTime = 0.0;
			for(int inner = 0; inner < times[0].length; inner++) {
        System.out.println("Runner index: " + outer + ", Time index: " + inner);
				// Enter the missing line of code to sum up the values in each row. Use the variable runnerTime
        runnerTime += times[outer][inner];
        
			}
			// Enter the missing line of code to find the average time of each runner. Use the variable averageVal
      double averageVal = 0;
      averageVal = runnerTime / times[outer].length;


			System.out.println("Sum of runner " + outer + " times: " + runnerTime);
			System.out.println("Average of runner " + outer + ": " + averageVal);
		}
	}
}

/* 
PRINTS

Runner index: 0, Time index: 0
Runner index: 0, Time index: 1
Runner index: 0, Time index: 2
Runner index: 0, Time index: 3
Runner index: 0, Time index: 4
Runner index: 0, Time index: 5
Sum of runner 0 times: 435.9149999999999
Average of runner 0: 72.65249999999999
Runner index: 1, Time index: 0
Runner index: 1, Time index: 1
Runner index: 1, Time index: 2
Runner index: 1, Time index: 3
Runner index: 1, Time index: 4
Runner index: 1, Time index: 5
Sum of runner 1 times: 427.2030000000001
Average of runner 1: 71.20050000000002
Runner index: 2, Time index: 0
Runner index: 2, Time index: 1
Runner index: 2, Time index: 2
Runner index: 2, Time index: 3
Runner index: 2, Time index: 4
Runner index: 2, Time index: 5
Sum of runner 2 times: 429.401
Average of runner 2: 71.56683333333334
*/
