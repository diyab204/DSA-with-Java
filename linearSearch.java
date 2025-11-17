// import java.util.*;
public class linearSearch {
    public static int linearrSearch(int n[] , int key){
        for(int i=0; i<n.length;  i++){
            if(n[i] == key){
                return i;
            } 
               
            
        }
         return -1;


    }
    public static void main(String[] args) {
        int n[] = { 2,4,6,8,10,12,14,16};
        int key = 10;
        int index = linearrSearch(n , key);
        System.out.println(index);

        
    }
    
}
