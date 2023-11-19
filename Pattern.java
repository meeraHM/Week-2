
public class Pattern {
	
	String Name;
	
	public void lowerTri(int lines ) {
		for (int i=0;i<lines;i++) { //for the lines
			for(int j=0;j<=i;j++) {//for the characters on each line
				
				System.out.print(j+1);
				
			}
			System.out.println();
			
		}
	}

	

	public void revTri(int lines ) {
		for (int i=0;i<lines;i++) { //for the lines
			for(int j=0;j<=lines;j++) {//for the characters on each line
				
				System.out.print(j+1);
				
			}
			System.out.println();}
		}	
		
		
		public void compTri(int lines ) {
			for (int i=0;i<lines-1;i++ ) {//for lines
				for (int j=0;j<=i;j++) { //for the characters on each line
					System.out.print(j+1);
				}
				System.out.println();
			}
			for (int i=0; i<lines;i++) {//for the lines
				for (int j=0;j<lines-i;j++) {//for the characters on each line
					System.out.print(j+1);
				}
				System.out.println();}
			}
			public void triangle(int l) {
				for(int i=0;i<l;i++) {//for the lines
					for (int j=0;j<l-i;j++) {//for the first triangles with spaces
						System.out.print(" ");
					}
					for (int j=i;j>0;j--) {//for the reverse characters on each line
						System.out.print(j+1);
					}
					for ( int j=0; j<=i;j++)//for the characters for the last triangle
						System.out.print(j+1);
					System.out.println();
				}
			}
				
				public void triangle1(int lines){
					for(int i=lines-1;i>=0;i--) {//for the lines
						for (int j=0;j<lines-i;j++) {//for the first triangles with spaces
							System.out.print(" ");
						}
						for (int j=i;j>0;j--) {//for the reverse characters on each line
							System.out.print(j+1);
						}
						for ( int j=0; j<=i;j++)//for the characters for the last triangle
							System.out.print(j+1);
						System.out.println();
					}
				}
				
					
			{
			}
		
	
		{
}
}