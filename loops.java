public class loops {
    public static void main(String[] args) {
        // int n = 5; 
        // int sum = 0;
        //  int i =1;
        
        // while(i<=n){
        //     sum = sum+i;
        //     i++; 
        // }
       
        // for(int i=1; i<=10; i++){
        //     System.out.println("hello diya");
        // }
        // for (int i = 1; i<=4 ; i++){
        //     System.out.println("****");
        // }
        int n = 10899;
        while(n > 0){
            int lastDigit = n%10;
            System.out.print(lastDigit + "");
            n = n/10;

        }
        System.out.println();

    }
    
}
