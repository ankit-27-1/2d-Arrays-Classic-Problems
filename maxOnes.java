class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int n=mat.length;
        int k=0;
        int max=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<mat[i].length;j++){
                
                if(mat[i][j]==1){
                    count++;
                }
                if(count>max){
                    max=count;
                    k=i;
                }
            }
        }
        int[] arr={k,max};
        return arr;
    }
}
