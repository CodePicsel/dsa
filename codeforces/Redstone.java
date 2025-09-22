class Redstone{
    public static void main(String[] args){
        int[][] arr = {
            {1,6},
            {2,3}
        };

        int answer=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<1; j++){
                answer=Math.min(answer, (arr[i][j]+arr[i][j+1]));
                System.out.println(arr[i][j]+arr[i][j+1]);
            }
        }
        System.out.println(answer);
    }
}