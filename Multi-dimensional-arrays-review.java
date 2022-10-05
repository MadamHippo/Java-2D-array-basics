// 2D Array REVIEW: We can declare and initialize 2D arrays in a few different ways depending on the situation:

// Declaring without initializing
int[][] intTwoD;
 
// Initializing an empty 2D array which has already been declared
intTwoD = new int[5][5];
 
// Declaring and initializing an empty 2D array at once
String[][] stringData = new String[3][6];
 
// Declaring and initializing a 2D array using initializer lists
double[][] doubleValues = {{1.5, 2.6, 3.7}, {7.5, 6.4, 5.3}, {9.8,  8.7, 7.6}, {3.6, 5.7, 7.8}};
 
// Initializing a 2D array using initializer lists after it has already been declared, or already contains data;
char[][] letters = new char[100][250];
letters = new char[][]{{'a', 'b', 'c'}, {'d', 'e', 'f'}};


// Here are examples of row-major and column-major order:

// Row-major order
for(int o = 0; o < letters.length; o++) {
    for(int i = 0; i < letters[o].length; i++) {
        char c = letters[o][i];
    }
}
 
// Column-major order
for(int o = 0; o < letters[0].length; o++) {
    for(int i = 0; i < letters.length; i++) {
        char c = letters[i][o];
    }
}
