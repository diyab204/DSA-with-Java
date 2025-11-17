import java.util.Scanner;
public class mulTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int mul; 

        for(int i=0 ; i<=10 ; i++){
            mul = n*i;
             System.out.println(mul);
            
            

            

        }
       
        sc.close();
        
    }
    
}
