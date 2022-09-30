import java.util.Arrays;
/* We are making a simple grayscale image editor program and we want to apply some modifications to the image. We have a 4x8 pixel image that is stored as a 2D array of integers. The integer value represents the brightness of the pixel, where the acceptable values are between 0 and 255, inclusive. */

public class Combining {
	public static void main(String[] args) {
		int[][] imageData={{100,90,255,80,70,255,60,50},
							         {255,10,5,255,10,5,255,255},
							         {255,255,255,0,255,255,255,75},
							         {255,60,30,0,30,60,255,255}};
		
		//First, we want to crop the image down to a 4x6 image, removing the right 2 columns. Declare and initialize a new 2D array of integers with 4 rows and 6 columns called `newImage`.
		int[][] newImage = new int[4][6]; // 4 is rows. 6 is columns.
    // HINT: Remember to create a new 2D array using this format: datatype[][] variableName = new datatype[rows][columns];.

		
    
		//Now that you have your empty image, use nested **for** loops to copy over the data from the original image to the new image, make sure not to include the cropped out columns.
		for(int i=0; i<newImage.length; i++){
      for(int j=0; j<newImage[i].length; j++){
        newImage[i][j] = imageData[i][j];
        // HINT: To copy over the values, use: new2DArray[row][col] = old2DArray[row][col].
      }
    }
		
		System.out.println(Arrays.deepToString(newImage));
	
		//You want to decrease the brightness of the new image by 50 units. The way this works is that for every integer in the new 2D array, we will subtract the value by 50. Remember that the value range for the pixel is 0-255, so if the result tries to go below 0, just set it equal to 0.
		for(int i=0; i<newImage.length; i++){
      for(int j=0; j<newImage[i].length; j++){
        if(newImage[i][j]-50<0){
          newImage[i][j] = 0;
        }
        else{
          newImage[i][j]-=50;
          // HINT: Remember to check if the value minus 50 is less than 0 when iterating through the elements of the new image: if(newImage[row][column]-50<0). If that condition is true, then set the element to equal 0 else subtract 50 from the element.


        }
      }
    }
		
		System.out.println(Arrays.deepToString(newImage));
	}
}

/*We traverse 2D arrays using nested loops.

We can use loops of any type, but we typically use nested for loops to keep track of the indices
Row-major order traverses through each row moving horizontally to the right through each row
Column-major order traverses through each column moving vertically down through each column
Row-major order and column-major order start and end on the same elements, but the paths are different.
In order to convert row-major to column-major, we need to make the outer loop terminating condition depend on the number of columns, make the inner loop terminating condition depend on the number of rows, and flip the variables in our accessor within the inner loop to ensure that we don’t try to access outside of the 2D array since we flipped the direction of traversal.*/
