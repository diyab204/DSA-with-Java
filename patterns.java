public class patterns {
    public static void main(String[] args) {
        // print star pattern 
        // for(int line=1; line<=4; line++){
        //     for(int star =1; star<=line; star++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //inverted star pattern 
        // int n=4;
        // for(int line=1; line<=4;line++){
        //     for(int star =1; star<= 4-line+1; star++ ){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //half pyramind pattern 
        // int n=4;
        // for(int line =1; line<=n ; line++){
        //     for(int number =1 ; number<=line; number++){
        //         System.out.print(number);
        //     }
        //     System.out.println();
        // }


        // character pattern
        int n=4;
        char ch = 'A';
        //outer loop
        for(int line =1; line<=n ; line++){
            for(int chars=1; chars<=line; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }


  }
    
}
