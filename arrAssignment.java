// public class arrAssignment {
//     public static int arrNum(int num[]){
        
        
//         for(int i=0 ; i<num.length; i++){
//             int n = num[i] ;
//             for(int j=i+1; j<num.length;j++){
//                 int m = num[j];
//                 if( num[i] == num[j]){
//                     System.out.println("true");
//                 }
                
//             }
//             return 0; 
            
            
            


//         }
//     }
//     public static void main(String[] args) {
//         int num[] = { 1,2,3,1};
//         System.out.println(arrNum(num));
//     }
    
// }

public class arrAssignment {
    public static void binSearch(int num[] , int target){
        int start = 0;
        int end = num.length-1;
       
        while(start<=end ){
            int mid = (start+end) /2;
            
             if(mid == target){
                System.out.println(mid);

             } 
                if(mid > target){
                    start = mid+1; 

                } else {
                    start = mid -1;
                }
             }
            

            
        
    }

    public static void main(String[] args) {
        // int num[] = { 4,5,6,7,0,1,2};

    }
}
