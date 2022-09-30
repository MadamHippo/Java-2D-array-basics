// Various loop practices...

// 1) enhanced for each loops. 

public class LoopPractice {
	public static void main(String[] args) {
		String[][] wordData = {{"study", "consider", "examine", "learn"}, {"ponder", "read", "think", "cogitate"}};
		
		// Use nested enhanced for loops to calculate the total number of characters in the wordData 2D array and print the result to the console. (Get the string .length() of each element)
    // HINT: Make sure to look at each array in the outer nested for loop for(String[] wordRow : wordData) and then each string within the subarray in the inner loop for(String word : wordRow).

		int characterCount = 0;
    for (String[] wordRow : wordData) {
      for (String character : wordRow) {
        characterCount+=character.length();
      }
      
    }

		System.out.println(characterCount);
		

    // 2) while loop
    
		//Using nested while loops, iterate through all of the elements in the 2D array and print them to the console using the format: word [row][column]. The formatted print statement has been provided.
    int i = 0, j = 0;
    while (i<wordData.length) {
      j = 0;
      while (j<wordData[i].length) {
        	System.out.println(wordData[i][j] + ": [" + i + "]" + "[" + j + "]");
          j++;
      }
      i++;
    }

	}
	
}
