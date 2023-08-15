class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] newMat=new int[r][c];
        if(mat.length*mat[0].length!=r*c){
            return mat;
        }
        int p=0;
        int q=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                newMat[p][q]=mat[i][j];
                q++;
                if(q==c){
                    q=0;
                    p++;
                }
            }
        }
        return newMat;
    }
}
