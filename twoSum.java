import java.util.Scanner;
public class twoSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Entere the size of the array");
        int size=sc.nextInt();
        
        System.out.println("Enter the elements of the array");
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
//two point to find the sum
        System.out.println("enter the target");
        int target=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("TARGET FOUND => the sum of"+arr[i]+ " at "+i+" and "+arr[j]+" at "+j+" = ");
                    System.out.print(arr[i]+arr[j]);
                    break;
                } 
            }
        }System.out.println("Target not found");
        

    }
    
}
