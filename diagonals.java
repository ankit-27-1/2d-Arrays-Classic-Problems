public class Main {
    static int sumDiagonalPrimary(int[][] matrix){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            sum=sum+matrix[i][i];
        }
        return sum;
    }
    static int sumDiagonalSecondary(int[][] matrix){
        int i=matrix.length-1;
        int j=0;
        int sum=0;
        while(i>=0 && j<matrix.length){
            sum=sum+matrix[i][j];
            i--;
            j++;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] matrix={{1,2,4,5},{2,6,7,1},{3,2,6,7},{9,4,1,3}};
        System.out.println(sumDiagonalPrimary(matrix));
        System.out.println(sumDiagonalSecondary(matrix));
    }
}
