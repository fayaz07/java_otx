package medium;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter order of matrix one: ");
		int r1 = scan.nextInt();
		int c1 = scan.nextInt();
		
		System.out.println("Enter order of matrix two: ");
		int r2 = scan.nextInt();
		int c2 = scan.nextInt();
		
		int mat1[][] = new int[r1][c1];
		int mat2[][] = new int[r2][c2];
		int res[][] = new int[r1][c2];
		
		System.out.println("Enter first matrix: ");
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				mat1[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("Enter second matrix: ");
		for(int i=0;i<r2;i++) {
			for(int j=0;j<c2;j++) {
				mat2[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("Your first matrix: ");
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				System.out.print(mat1[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Your second matrix: ");
		for(int i=0;i<r2;i++) {
			for(int j=0;j<c2;j++) {
				System.out.print(mat2[i][j]+" ");
			}
			System.out.println();
		}
		
		if(c1==r2) {
			
			System.out.println("\n\noutput matrix:-");
			for (int i= 0 ; i < r1 ; i++ ) 
				for (int j= 0 ; j <c2;j++)
				{
					int sum=0;
					for (int k= 0 ; k <r2;k++ )
					{
						sum +=mat1[i][k]*mat2[k][j] ;
			 
					}
					res[i][j]=sum;
				}
				
			for (int i= 0 ; i < r1; i++ )
			{
				for (int j=0 ; j < c2;j++ )
					System.out.print(res[i][j]+" ");
				System.out.println();
			}
		}
		else
			System.out.print("multipication does not exist ");
		
		scan.close();
	}
	
}
