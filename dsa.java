// public class dsa {

//     public static void main(String[] args) {
//         System.out.println("    *\n   **\n  ***\n ****\n*****");
//     }
// }

//TAKING INPUT
// import java.util.Scanner;
// public class dsa{
//     public static void main(String[] args){
//         System.out.println("enter your name");
//         Scanner input= new Scanner(System.in);
//         String a=input.nextLine();
//         System.out.println("welcome "+ a);

//     }

// }


//SUM OF TWO NUMBERS 
// import java.util.Scanner;
// public class dsa{
//     public static void main(String[] args){
//         int a=5;
//         int b=7;
//         int sum=a+b;
//         System.out.println("the sum of a and b is= "+ sum);
//     }
// }


// import java.util.Scanner;
// public class dsa{
//     public static void main(String[] args){
//         Scanner input=new Scanner(System.in);
//         System.out.println("enter first number");
//         int a=input.nextInt();
//         System.out.println("enter second number");
//         int b=input.nextInt();
//         int sum=a+b;

//         System.out.println("the sum of a and b is= "+ sum);
//     }
// }


// import java.util.Scanner;
// public class dsa{
//     public static void main(String[] args){
//         Scanner input=new Scanner(System.in);
//         System.out.println("enter the first number");
//         int a=input.nextInt();
//         System.out.println("enter the second number");
//         int b=input.nextInt();
//         System.out.println("the number is = "+a+b);

//         //swaping
//         int c;
//         c=a;
//         a=b;
//         b=c;
//         System.out.println("the number is = "+a+b);
//     }
// }

//TAKEING USER INPUT FROM THE USER AND PRINT THE ELEMENTS OF THE ARRAY

// import java.util.Scanner;
// public class dsa{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the length of the array");
//         int n=sc.nextInt();

//         int[] arr=new int[n];
        
//         System.out.println("enter the elements of the array");
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         System.out.println("the array elements are");
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i] +" ");
//         }
  
    
//     }
// }


//PRINTING ONLY THE NEGATIVE ELEMENTS

// import java.util.Scanner;
// public class dsa{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the size of the array :"+" ");
//         int n=sc.nextInt();
//         int[] arr=new int[n];
        
//         //taking the input from the user in the array
//         System.out.print("Enter the elements of the array :"+" ");
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//         //printing all the elements of the array which are negative
//         System.out.print("The negative elements of the arrys are :"+" ");
//         for(int i=0;i<=arr.length;i++){
//             if(arr[i]<0){
//                 System.out.print(arr[i]+" ");
//             }

//         }

     
//     }
// }

// PRINTING THE SUM OF THE TOTAL ELEMENT OF THE ARRAY

// import java.util.Scanner;
// public class dsa{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Entere the size of the array :");
//         int n=sc.nextInt();

//         int[] arr=new int[n];
        
//         System.out.print("Entere the elements of the array :"+" ");
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//         int sum=0;
        
//         for(int i=0;i<arr.length;i++){
//             sum+=arr[i];
            
//         }
//         System.out.print("The sum of the array elements are ="+ sum);

//     }
// }


//PRINTING THE PRODUCT OF THE TOTAL ELEMENT OF THE ARRAY

import java.util.Scanner;
public class dsa{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Entere the size of the array :");
        int n=sc.nextInt();

        int[] arr=new int[n];
        
        System.out.print("Entere the elements of the array :"+" ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        
        int product=1;
        for(int i=0;i<arr.length;i++){
            
            product*=arr[i];
            
        }
        System.out.print("The product of the array elements are ="+ product);
        System.out.print("The product of the array elements are =");
        System.out.print("The product of the array elements are =" +product);
        System.out.print("The product of the array elements are =" +product);
        System.out.print("The product of the array elements are =" +product);
        System.out.print("The product of the array elements are =" +product);
        System.out.print("The product of the array elements are =" +product);
    }
}