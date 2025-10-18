import java.util.Arrays;

class Array15{
    public static void main(String[] args){
        int[][] mat = {
            {1, 1, 1, 1},
            {1, 0, 0, 1},
            {1, 1, 0, 0},
            {1, 1, 1, 1},
        };
        brute(mat);
        // optimal(mat);
    }
    static void brute(int[][] mat){
        int[] zerosX = new int[4];
        int[] zerosY = new int[4];
        for(int i=0; i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==0){
                    zerosX[j]=1;
                    zerosY[i]=1;
                }
            }
        }
        
        for(int i=0; i<zerosX.length;i++){
            if(zerosX[i]==1){
                for(int j=0;j<zerosY.length;j++){
                    mat[j][i]=0;
                }
            }
        }
        for(int i=0; i<zerosY.length;i++){
            if(zerosY[i]==1){
                for(int j=0;j<zerosX.length;j++){
                    mat[i][j]=0;
                }
            }
        }
        System.out.println(Arrays.deepToString(mat)); 
    }
    static void optimal(int[][] mat){

        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat.length; j++){
                if(mat[i][0]==0){
                    
                }else if(mat[0][j]==0){

                }else if(mat[i][j]==0){
                    mat[0][j]=0;
                    mat[i][0]=0;
                }
            }
        }
    }
}