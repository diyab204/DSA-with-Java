public class subArr {
    public static void printSubArrays(int num[]){
        int currSum =0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[num.length];
        prefix[0] = num[0];

        //calculate prefix array 
                for(int i=1; i<prefix.length; i++ ){
                    prefix[i] = prefix[i-1] + num[i];

                }
        for(int i=0; i<num.length; i++){
            int start = i;
            System.out.println(start);
            for(int j=i+1; j<num.length; j++){
                int end = j;
                System.out.println(end);
                

                
                // for(int k = start; k<=end; k++){
                    // System.out.print(num[k] + " ");
                    // subarray sum 
                //     currSum += num[k];
                // }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
                
                
            }
            
        }
        System.out.println("max sum subArr = " + maxSum);
    }
    public static void main(String[] args) {
        int num[] = { 2,4,6,8,10};
        printSubArrays(num);
    }
    
}
