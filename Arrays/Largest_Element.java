import java.util.*;
class MaxElement{
    void largestElementOptimal(){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the size of the array");
            int size = sc.nextInt();
            
            //corner case 
            if(size <= 0){
                System.out.println("Size cannot be zero or negative");
            }else {
                int [] arr = new int[size];
                for(int i = 0; i < arr.length; i++){
                    arr[i] = sc.nextInt();
                }
                ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
                int largest = arr[0];
                for(int i = 0; i < arr.length; i++){
                    if(arr[i] > largest){
                        largest = arr[i];
                    }
                }
          
              System.out.println(largest);
          ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
            }
          
          
        }catch(InputMismatchException e){
            System.out.println("Error in input :" + e.getMessage());
        }
    }
}
public class Main{
    public static void main(String[]args){
        MaxElement maxElement = new MaxElement();
        maxElement.largestElementOptimal();
    }
}
