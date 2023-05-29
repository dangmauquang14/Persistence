package phonglogic.generic;

import java.util.Arrays;
import java.util.Scanner;

public class Mang2Chieu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = 6, col = 6;
		String[][] a = new String[row][col];
		// in hình vuông *
//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < col; j++) {
//				a[i][j] = "*";
//				if(i > 0 && i < row - 1) {
//					if(j == 0 || j == col - 1) {
//						a[i][j] = "*";;
//					} else
//						a[i][j] = " ";
//				}
//			}
//		}
//		print(a, row, col);
		
		// in chu z ngược
//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < col; j++) {
//				a[i][j] = "*";
//				if(i > 0 && i < row - 1) {
//					if(j == i) {
//						a[i][j] = "*";;
//					} else
//						a[i][j] = " ";
//				}
//			}
//		}
//		print(a, row, col);
		
		// in mang chu A, 
//		AAAAAA
//		BABABA
//		ABABAB
//		BBBBBB

//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < col; j++) {
//				if(i == 0) {
//					a[i][j] = "A";
//				}else if(i == row -1 ) {
//					a[i][j] = "B";
//				}else if(i%2 == 0){
//					if(j%2 != 0) {
//						a[i][j] = "B";
//					}else 
//						a[i][j] = "A";
//				}else if(i%2 != 0){
//					if(j%2 != 0) {
//						a[i][j] = "A";
//					}else 
//						a[i][j] = "B";
//				}
//			}
//		}
		
		/*  AAAAA
			BBBBB
			AAAAA
			BBBBB
			AAAAA
		 */
		
//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < col; j++) {
//				if(i %2 == 0) {
//					a[i][j] = "A";
//				}else
//					a[i][j] = "B";
//			}
//		}
//		for (int i = 0; i < row ; i++) {
//			for (int j = 0; j < row; j++) {
//					System.out.print("*");
//				}
//			System.out.println();
//
//		}
//		print(a, row, col);
		
		/*  ABABA
			ABABA
			ABABA
			ABABA
			ABABA
		 */
//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < col; j++) {
//				if(j %2 == 0) {
//					a[i][j] = "A";
//				}else if(j%2 != 0)
//					a[i][j] = "B";
//			}
//		}
//		print(a, row, col);
		
		/*
			******
			*     
			*   
			*            
			*    
			******
		 */
//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < col; j++) {
//				if(i == 0 || i == row - 1) {
//					a[i][j] = "*";
//				}
//				if(i > 0 && i < row - 1) {
//					if(j == 0) {
//						a[i][j] = "*";;
//					} else
//						a[i][j] = " ";
//				}
//			}
//		}
//		print(a, row, col);
		
		/*				
		        *    *
				*    *
				*    *
				*    *
				*    *
				******

		 */
		
//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < col; j++) {
//				if(i == row - 1) {
//					a[i][j] = "*";
//				} else {
//					if(j == 0 || j == col - 1) {
//						a[i][j] = "*";;
//					} else
//						a[i][j] = " ";
//				}
//			}
//		}
//		print(a, row, col);
		
		
		
		/*
		 **
		 **
		 ***
		 ****
		 *****

		 *****
		 ****
		 ***
		 **
		 *

		 */
//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < col; j++) {
//				if(j<=i) {
//					a[i][j] = "*";
//				}else
//					a[i][j] = "";
//			}
//		}
//		print(a, row, col);
		
//		for (int i = 0; i < row ; i++) {
//			for (int j = 0; j <= i; j++) {
//					System.out.print("*");
//				}
//			System.out.println();
//
//		}
//		

		
//		for (int i = row; i > 0 ; i--) {
//			for (int j = 0; j < i; j++) {
//					System.out.print("*");
//				}
//			System.out.println();
//
//		}
		/*
		 *  0 1 2 3 4 5 
			0 1 2 3 4 
			0 1 2 3 
			0 1 2 
			0 1 
			0 
		 */
//		for (int i = row; i > 0 ; i--) {
//			for (int j = 0; j < i; j++) {
//					System.out.print(j + " ");
//				}
//			System.out.println();
//
//		}
//		print(a, row, col);
		/*
			 * 
	        **
	       ***
	      ****
	     *****  
	     
	     *****
	      ****
	       ***
	        **
	         *
		 */
//		for(int i = row; i > 0; i--){
//			for(int j = 0;j < row - i; j++)
//				System.out.print("*");
//			for(int j = 1; j <= i; j++) {
//				System.out.print(" ");
//			}
//			System.out.println();
//		}
//		
//		for(int i = row; i > 0; i--){
//			for(int j = 0;j < row - i; j++)
//				System.out.print(" ");
//			for(int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		/*
		   *   
		  ***
		 *****
		*******

		 *******
		  *****
		   ***
		 	*    

		 */
		
		for(int i = 0; i <= row; i++){
			for(int j = 0;j < row - i; j++)
				System.out.print(" ");
			for(int j = 1; j <= 2*i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
//		for(int i = row; i > 0; i--){
//			for(int j = 0;j < row - i; j++)
//				System.out.print(" ");
//			for(int j = 1; j <= 2*i - 1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	
	
	}	
	public static void print(String[][] a, int row, int col){
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("\n");
		}
	}
}
