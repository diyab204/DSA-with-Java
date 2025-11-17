public class KadaneAlgo {

     public static void printSubArrays(int num[]){
       

       
        for(int i=0; i<num.length; i++){
            int start = i;
            for(int j=i+1; j<num.length; j++){
                int end =j;
                 for(int k = start; k<=end; k++){
                    System.out.print(num[k]);
                   
              
                
                
            }
            }
                
            
                

                
               
        }
       
    }

    public static void kadanes(int num[]){
        int ms = Integer.MIN_VALUE;      //-infinite
        int cs = 0; 
        for(int i=0; i<num.length; i++){
            cs = cs + num[i];
            if (cs<0){
                cs=0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("our maximum subarray sum is : " + ms);


    }
    public static void main(String[] args) {
        int num[] = {-2 , -3, 4, -1, -2, 1 ,5,-3};
        kadanes(num);
    }
    
}
