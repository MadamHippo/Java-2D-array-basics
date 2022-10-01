public class ColumnMajor {
	public static void main(String[] args) {
    // Given runner lap data
		double[][] times = {{64.791, 75.972, 68.950, 79.039, 73.006, 74.157}, {67.768, 69.334, 70.450, 67.667, 75.686, 76.298}, {72.653, 77.649, 74.245, 62.121, 63.379, 79.354}};
		
		// Replace the incorrect for loop headers, use the iterators 'outer' and 'inner' for the outer and inner loops
		double lapTime = 0.0;
		for(int outer = 0; outer < times[0].length; outer++){
			lapTime = 0.0;
			for(int inner = 0; inner < times.length; inner++){
				System.out.println("Lap index: " + outer + ", Time index: " + inner);
				// Enter the missing line of code to sum up the values in each column. Use the variable lapTime
        lapTime += times[inner][outer]; // <- Hippo why is it [inner] [outer] instead of outer inner?
        
			}
			// Enter the missing line of code to find the average time of each lap. Use the variable averageVal
			double averageVal = 0;
      averageVal = lapTime / times.length;

			System.out.println("Sum of lap " + outer + " times: " + lapTime);
			System.out.println("Average time for lap " + outer + ": " + averageVal);
		}
	}
}


/* 


PRINTS

Output:
Lap index: 0, Time index: 0
Lap index: 0, Time index: 1
Lap index: 0, Time index: 2
Sum of lap 0 times: 205.212
Average time for lap 0: 68.404
Lap index: 1, Time index: 0
Lap index: 1, Time index: 1
Lap index: 1, Time index: 2
Sum of lap 1 times: 222.95499999999998
Average time for lap 1: 74.31833333333333
Lap index: 2, Time index: 0
Lap index: 2, Time index: 1
Lap index: 2, Time index: 2
Sum of lap 2 times: 213.645
Average time for lap 2: 71.215
Lap index: 3, Time index: 0
Lap index: 3, Time index: 1
Lap index: 3, Time index: 2
Sum of lap 3 times: 208.82700000000003
Average time for lap 3: 69.60900000000001
Lap index: 4, Time index: 0
Lap index: 4, Time index: 1
Lap index: 4, Time index: 2
Sum of lap 4 times: 212.071
Average time for lap 4: 70.69033333333333
Lap index: 5, Time index: 0
Lap index: 5, Time index: 1
Lap index: 5, Time index: 2
Sum of lap 5 times: 229.80899999999997
Average time for lap 5: 76.603
*/
