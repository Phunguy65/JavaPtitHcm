package org.ptithcmcode;

/**
 * J02104:
 * Cho đồ thị vô hướng G=<V, E> được biểu diễn dưới dạng ma trận kề. 
 * <p> 
 * Hãy viết chương trình thực hiện chuyển đổi biểu diễn đồ thị dưới dạng danh sách cạnh.
 */
public class J02104 {
    
    private static void convertMatrixToList(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 1 && i < j) {
                    System.out.println("(" + (i + 1) + "," + (j+1) + ")");
                }
            }
        }
    }
    
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        convertMatrixToList(matrix);
        
        
        sc.close();
    }
}
