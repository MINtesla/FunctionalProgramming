package Day1;

public class Problem1 {
    public static void main(String[] args) {
        System.out.println("Practive one o one ---!");
    }
}

class Solution1 {
// LINK - https://leetcode.com/problems/set-matrix-zeroes/

    // treat internal matrix different from outer layer of vertical and horizontal one side each bcs
    // this is like giving indication to the outer layer that what need to be marked to be 0
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean rc = false;
        boolean cc = false;
        for(int i = 0; i<n; i++) {
            if(matrix[i][0] == 0){
                rc = true;
            }
        }
        for(int i = 0 ; i < m ; i++){
            if(matrix[0][i] == 0){
                cc = true;
            }
        }
        for(int i = 1 ; i < n ; i++){
            for(int j = 1 ; j < m ; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for(int i = 1 ; i < m ; i++){
            if(matrix[0][i] == 0){
                for(int j = 0 ; j < n ; j++){
                    matrix[j][i] = 0;
                }
            }
        }
        for(int i = 1 ; i < n ; i++){
            if(matrix[i][0] == 0){
                for(int j = 0 ; j < m ; j++){
                    matrix[i][j] = 0;
                }
            }
        }

        if(rc){
            for(int i = 0 ; i < n ; i++){
                matrix[i][0] = 0;
            }
        }
        if(cc){
            for(int i = 0 ; i < m ; i++){
                matrix[0][i] = 0;
            }
        }


    }
}