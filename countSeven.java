public class Main {
    static int countSeven(int[][] matrix){
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==7){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] matrix={{2,3,7},{2,1,5},{7,1,4}};
        System.out.println(countSeven(matrix));
    }
}
