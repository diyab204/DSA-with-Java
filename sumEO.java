// import java.util.Scanner;
public class sumEO {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int n =5 ;
        int sum = 0;
        int i=1;
        while(i<=n){
            if(i%2==0){
                System.out.println("number is even");
                sum = sum+i;
                i++;
                System.out.println(sum);
            } else{
                System.out.println("number is odd");
                sum = sum+i;
                i++;
                System.out.println(sum);
            }
        }
        
    }
    
}
