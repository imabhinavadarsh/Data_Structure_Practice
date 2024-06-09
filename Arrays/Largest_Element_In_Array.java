import java.util.*;
class MaxElement{
    void largestNotOptimal(){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the size of the array :");
            int size = sc.nextInt();
            
            //corner case 
            if(size <= 0){
                System.out.print("size cannot be zero or negative");
            }else{
                int [] arr = new int[size];
                for(int i = 0; i < arr.length; i++){
                    arr[i] = sc.nextInt();
                }
                Arrays.sort(arr);
                System.out.println("Largest Element is : " + arr[arr.length -1]);
            }
        }catch(InputMismatchException e){
            System.out.println("Error in input :" + e.getMessage());
        }
    }
}
public class Main{
    public static void main(String[]args){
        MaxElement maxElement = new MaxElement();
        maxElement.largestNotOptimal();
    }
}
