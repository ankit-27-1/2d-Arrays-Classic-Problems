public class Main {
    static boolean transpose(int[][] matrix){
        int n=matrix.length;
        int m=matrix[0].length;
        int[][] newMat=new int[m][n];
        for(int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                newMat[j][i]=matrix[i][j];
            }
        }
        for (int i=0;i<newMat.length;i++){
            for (int j=0;j<newMat[0].length;j++){
                System.out.print(newMat[i][j]);
            }
            System.out.println();
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] matrix={{2,3},{2,1},{7,1}};
        System.out.println(transpose(matrix));
    }
}
