// public class Arrays {
//     public static void update(int marks[]){
//         for(int i=0; i<marks.length; i++){
//             marks[i] = marks[i]+1;

//         }

//     }


//     public static void main(String[] args) {
//         int marks[] = {97,98,99};
//         update(marks);

//         // print our marks
//         for(int i=0; i<marks.length; i++){
//             System.out.print(marks[i] + " ");

//         }
//         System.out.println();
        
//     }
    
// }

// largest in array
// import java.util.*;
public class Arrays {
    public static int getLargest(int num[]){
        int largest = Integer.MIN_VALUE; //-infinty
        for(int i=0; i<num.length; i++){
            if(largest < num[i]){
                largest = num[i];
            }
            
        }
         return largest;
       
    }
    


    public static void main(String[] args) {
        int num[] = { 1,2,6,4,5};
        System.out.println(getLargest(num));

        
    }
}
