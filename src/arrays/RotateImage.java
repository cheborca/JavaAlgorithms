/*
    cheborca @2018
 */
package arrays;

/*
    You are given an n x n 2D matrix that represents an image. 
    Rotate the image by 90 degrees (clockwise).

    a: [[1,2,3],                  a: [[7,4,1], 
       [4,5,6],   --ROTATE---->      [8,5,2], 
       [7,8,9]]                      [9,6,3]]

 */
public class RotateImage {
    
    int[][] rotateImage(int[][] a) {
    
    int tem;
    int n = a.length;
    
    for(int i = 0; i<n; i++){
	        for(int j = i; j<a[0].length; j++){
	            tem = a[i][j];
	            a[i][j] = a[j][i];
	            a[j][i] = tem;
	        }
	    }
	    for(int i =0 ; i<n; i++){
	        for(int j = 0; j<n/2; j++){
	            tem = a[i][j];
	            a[i][j] = a[i][n-1-j];
	            a[i][n-1-j] = tem;
	        }
	    }
	    
	    return a;
}
}
