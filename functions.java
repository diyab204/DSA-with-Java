// import java.util.Scanner;
// public class functions {
//     public static void calSum(int num1, int num2){ //parameters or formal parameters 
//         int sum = num1+num2;
//         System.out.println("sum is :" + sum);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//          int b = sc.nextInt();
//          calSum(a,b); // arguments or actual arguments
//          sc.close();

        
//     }
    
// }

// public class functions{
//     public static int multiply(int a, int b){
//         int product = a*b;
//         return product;
//     }

//     public static void main(String[] args) {
//         int a = 3;
//         int b = 5;
//        int prod =  multiply(a, b);
//        System.out.println(prod);
//     }
// }

//factorial 
// public class functions {
//     public static int factorial (int n){
//         int f=1;
//         for(int i=1; i<=n; i++){
//             f = f*i;
//         }
//         return f; // factorial of n
//     }
//      public static int binCoeff(int n , int r){
//         int fact_n = factorial(n);
//         int fact_r = factorial(r);
//         int fact_nmr = factorial(n-r);
//         int binCoeff = fact_n / (fact_r *fact_nmr);
//         return binCoeff;

//     }
//     public static void main(String[] args) {
//         System.out.println(binCoeff(5,2));
//     }
// }

// binomial coeff

//check if a number is prime or not

public class functions{
    // public static boolean isPrime(int n){

    //     boolean isPrime = true;
    //     for(int i=2; i<=n-1; i++){
    //         if(n%i ==0){
    //             isPrime = false;
    //             break;
    //         }
    //     }
    //     return isPrime;
    // }
    public static boolean isPrime(int n){ //optimized
        if(n == 2){
            return true;
        }
        for( int i=2; i<=Math.sqrt(n); i++){
            if(n%i ==0){
                return false;
            }
        }
        return true; 
    }
    public static void primesInRange(int n){
        for(int i =2 ; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i+ " ");
            }
        }
        System.out.println();

    }
    public static void main(String[] args) {
        primesInRange(20);
    }
}


   
