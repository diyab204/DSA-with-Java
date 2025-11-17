import java.util.Scanner;
public class breakKey {
    public static void Calsum(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("sum is :" + sum);
        sc.close();
    }
    
    public static void main(String[] args) {
        Calsum();
        


        // do{
        //     System.out.println("enter number");
        //     int n = sc.nextInt();
        //     if(n%10==-0){
        //         break;
        //     }
        //     System.out.println(n);

        // }while(true);

        // sc.close();
        
    } 
    
}

