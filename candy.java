import java.util.Arrays;

public class candy {
    public static int[]  candyRes(int candies[] , int extraCandies){
       
        int[] result = new int[candies.length];
        // int sum = 0;
        
        for(int i=0; i<candies.length;i++){
            // sum = sum + candies[i];
        
            
            candies[i] = candies[i] + extraCandies;
           
        
           
            // System.out.println(candies[i] + " "+  "extracandies");
            // System.out.println(sum);
            // result[i] = Math.max(candies[i] , sum);
            // if (candies[i] > sum){
            //     return result[i] = true;
            // }
            // System.out.println(result[i]);
            // if(candies[i] > sum){
            //     result[i] =  1 ;
                
            //      System.out.println(result[i]);
            // }
            // else {
            //     result[i] = 0 ;
            //      System.out.println(result[i]);
                
            // }
            
            
            
        }
        return result;

    }
    public static void main(String[] args) {
        int candies [] = { 2,3,5,1,3};
        int extraCandies = 3;
        int[] res = candyRes(candies, extraCandies);
        System.out.println(Arrays.toString(res));

    }
    
}
