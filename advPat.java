// public class advPat {
//     public static void hollow_rectangle(int totRows , int totCols){
//         for(int i=1; i<=totRows; i++){
//             // inner columns
//             for(int j=1; j<=totCols; j++){
//                 // cell-(i,j)
//                 if(i == 1 || i == totRows || j== 1 || j== totCols){
//                     System.out.print("*");

//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();

//         }
//     }
//     public static void main(String[] args) {
//         hollow_rectangle(4, 5);
//         //hollow rect
//     }
    
// }

// public class advPat {
//     public static void inv_rot_half_pyramind(int n){
//         for(int i=1; i<=n; i++){
//             //spaces
//             for(int j=1; j<= n-i; j++){
//                 System.out.print(" ");

//             }
//             //stars 
//             for(int j=1 ; j<=i ; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

//      public static void main(String[] args) {
//         inv_rot_half_pyramind(4);
        
//      }
// }

// public class advPat{
//     public static void inverted_half_pyramindNum(int n){
//         for(int i=1 ; i<=n ;i++){
//             for(int j=1;j<=n-i+1; j++){
//                 System.out.print(j + " ");
//             }
//             System.out.println();


            
//         }
//     }
//     public static void main(String[] args) {
//         inverted_half_pyramindNum(5);
        
//     }
// }

//0-1 triangle

public class advPat{
    public static void zero_one_triangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1 ; j<=i; j++){
                if((i+j) % 2 == 0){
                    System.out.print("1" + " ");
                }else {
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        zero_one_triangle(5);
        
    }
}