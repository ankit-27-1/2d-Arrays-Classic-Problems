public class Main {
    static void printSprirl(int[][] matrix){
        int n=matrix.length;
        int startRow=0;
        int startCol=0;
        int endRow=n-1;
        int endCol=matrix[0].length-1;
        while(startRow<=endRow && startCol<=endCol){
            for(int j=startCol;j<=endCol;j++){
                System.out.println(matrix[startRow][j]+" ");
            }
            for(int i=startRow+1;i<=endRow;i++){
                System.out.println(matrix[i][endCol]+" ");
            }
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow){
                    break;
                }
                System.out.println(matrix[endRow][j]+" ");
            }
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol==endCol){
                    break;
                }
                System.out.println(matrix[i][startCol]+" ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
    }
    public static void main(String[] args) {
        int[][] matrix={{1,2,4,5},{2,6,7,1},{3,2,6,7},{9,4,1,3}};
        printSprirl(matrix);
    }
}
