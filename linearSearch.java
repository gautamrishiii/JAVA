// import java.util.Scanner;

// public class linearSearch {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the length of the array");
//         int size = sc.nextInt();
//         int[] arr = new int[size];

//         System.out.println("Enter the elements of the array");
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();

//         }
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//         System.out.println("Enter the element you want to search in the array");
//         int target = sc.nextInt();

//         boolean found = false;
//         for (int i = 0; i < arr.length; i++) {

//             if (arr[i] == target) {
//                 found = true;
//                 break;
//             }

//         }
//         if (found)
//             System.out.print("The element is found");
//         else
//             System.out.println("The element is not found");

//     }

// }

//PRINT WITH FOOUND AT INDEX 
import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Enter the element you want to search in the array");
        int target = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                found = true;
                 System.out.print("The element is found AT index "+i);
                break;
            }

        }
        if (!found)System.out.println("The element is not found");
           
        
            

    }

}
