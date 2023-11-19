
public class squareStar {

	 public static void printSquareStar(int size) {
	        if (size < 2) {
	            System.out.println("Invalid size. Size must be 2 or greater.");
	            return;
	        }

	        for (int i = 0; i < size; i++) {
	            for (int j = 0; j < size; j++) {
	                // for first and last rows or columns print stars
	                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("  "); // for spaces for inside the square
	                }
	            }
	            System.out.println(); 
	        }
	    }

	    public static void main(String[] args) {
	        int squareSize = 5; // for adjust the square size

	        // Print the square star pattern
	        printSquareStar(squareSize);
	    


	}

}
