class Main{
   public static void main(String[] args){
      // System.out.println("Hello wolrd");
      int[] arr={52, 28, 10, 4, 8, 25, 76, 57};
      int max =Integer.MIN_VALUE;
      int min =Integer.MAX_VALUE;
      for(int a:arr){
         max = maxFun(max, a);
         min = minFun(min, a);
      }
      System.out.println("Max: "+max);
      System.out.println("Min: "+min);
   }

   static int maxFun(int a, int b){
      if(a>b) return a;
      else return b;
   }
   static int minFun(int a, int b){
      if(a<b) return a;
      else return b;
   }
}
