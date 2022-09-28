public class Exercise2 {
	public static void main(String[] args) {
    
		// Declare a 2d array of float values called floatTwoD
    float[][] floatTwoD;
    

		// Initialize the 2d array from the last step to an empty 2d array consisting of 4 arrays with 10 elements each
    floatTwoD = new float[4][10];
    // The first set of brackets contains the number of arrays, while the second set of brackets contains the number of elements in a sub-array.
		

		// IN ONE LINE: Declare and initialize an empty 2d array of integers consisting of 15 rows and 8 columns called dataChart

    int[][] dataChart = new int[15][8];
    // Example structure: data_type[][] array_Name = new data_type[no_of_rows][no_of_columns];
    
		
		// Create a 2D char array called ticTacToe representing the provided tic-tac-toe board. Use the characters 'X', 'O', and ' '.
    // Do not declare ticTacToe again aka don't write char[][] again bc when you say the type thats when you're declaring it.

    char[][] ticTacToe = {{'X', 'O', 'O'}, {'O', 'X', ' '}, {'X', ' ', 'X'}};
    
	
		// When no one is looking, you want to modify the game to where you, 'O', wins the game. Replace the game board so that all X’s are O’s and all O’s are X’s. Do this in one line with initializer lists.
    // assigning a new 2D array to an existing 2D array stored in a variable.
    ticTacToe = new char[][] {{'O', 'X', 'X'}, {'X', 'O', ' '}, {'O', ' ', 'O'}};
    
    }
}



