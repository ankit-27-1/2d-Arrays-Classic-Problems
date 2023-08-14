public class Main {
    static int sumSecond(int[][] matrix){
        int sum=0;
        for(int i=0;i<matrix[1].length;i++){
            sum=sum+matrix[1][i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] matrix={{2,3,7},{2,1,5},{7,1,4}};
        System.out.println(sumSecond(matrix));
    }
}
