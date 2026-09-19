// import java.util.Scanner;
// public class shorthand{

//     public static void main(String[] args){
//       int a=5; 
//       Scanner sc = new Scanner(System.in);
//       int x1=sc.nextInt();
//       a=a+x1;
//       System.out.println(a);
//       int x2=sc.nextInt();
//       a-=x2;
//       System.out.println(a);
//       int x3=sc.nextInt();
//       a*=x3;
//       System.out.println(a);
//       int x4=sc.nextInt();
//       a/=x4;
//       System.out.print(a);  
//       sc.close();
//     }
// }
// import java.util.Scanner;
// public class shorthand{
//   public static void main(String[] args){
//     System.out.println("enter first number ");
//     Scanner sc = new Scanner(System.in);
//     int a=sc.nextInt();
//     int b=sc.nextInt();
    
//     int add=a+b;
//     System.out.println("addition= " + add);
    
//     int sub=a-b;
//     System.out.println("subtraction= " +sub);
    
//     int div=a/b;
//     System.out.println("division= " + div);

//     int multi=a*b;
//     System.out.println("multiplication = " + multi);
//   }
// }

 
// import java.util.Scanner;
// public class shorthand{
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int a = sc.nextInt();
//         if((a & 1) ==0){
//             System.out.println("even");
//         }
//         else{
//             System.out.println("odd");
//         }
     
        

//     }
// }
// import java.util.Scanner;
// public class shorthand{
    // public static void main(String[] args){
        //  
// 
        // greetingCat(5);  
    //  
    // }
// 
    //  public static int  greetingCat(int b){
            // Scanner sc = new Scanner(System.in);
            // System.out.print("Enter the number: ");
            // int a = sc.nextInt();
            // int square=a*a;
            // System.out.println("square of the number is: " + square);
            // sc.close();
            // return square;
    //  }
// }
// 

// public class shorthand {
//     public static void main(String[] args) {
//         pattern(5);
//     }

//     public static void pattern(int n) {

//         int a = 1;

//         while (a <= n) {

//             int b = 1;

//             while (b <= a) {
//                 System.out.print("*");
//                 b++;
//             }

//             System.out.println();
//             a++;
//         }
//     }
// }

//WAP TO PRINT THE TABLE OF N 
// import java.util.Scanner;
// public class shorthand{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the table");
//         int n=sc.nextInt();
//         table(n); 
//     }
//     public static void table(int n){
//         for(int i=1;i<=10;i++){
//             System.out.println(n +"x" + i +"="+(n*i) );

//         }
       
//     } 
// }

//SUM OF ODD NUMBERS FORM 1 TO N;
// import java.util.Scanner;
// public class shorthand{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("which table you want to print");
//         int n=sc.nextInt();
//         odd(n);


//     }
//     public static void odd(int n){
//         int sum=0;
//         for(int i=1;i<=n;i+=2){
//             if(i%2!=0){
//                   sum +=i;
//             }
            
//         }
//         System.out.println(sum);

//     }
// }

// import java.util.Scanner;
// public class shorthand{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number whose factorial you want to claculate");
//         int n=sc.nextInt();
//         System.out.println("the factorial of" +" "+n+" "+ "is"+" " +fact(n));
//     }
//     public static long fact(int n){
//         long factorial=1;
//         if(n==0){
//             return 0;
//         }else if(n==1){
//             return 1;
//         }
//         for(int i=2;i<=n;i++){
//             factorial *=i;
//         }
//     return factorial;
//     }
// }

// WAP TO PRINT THE SUM OF DIGITS OF A NUMBER
// import java.util.Scanner;
// public class shorthand{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter a number");
//         int n=sc.nextInt();
//         System.out.println(odd(n));
//     }
//      public static int odd(int n){
//         int sum=0;
//         while(n>0){
//             int x=n%10;

//             sum =sum +x;
//             n=n/10;
//         }
//        return sum;
//     }
// }


// import java.util.Scanner;
// public class shorthand{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number");
//         int n=sc.nextInt();
//         System.out.println(add(n));

//     }

//     public static int add(int n){
//         int sum=0;
//         while(n>0){
//             sum = sum +(n%10);
//             n=n/10;
            


//         }
//         return sum;
        
//     }
    
// }

// import java.util.Scanner;
// public class shorthand{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the first number");
//         int a=sc.nextInt();
//         System.out.println("enter the second number");
//         int b=sc.nextInt();
//         lcm(a,b);
//         //System.out.println("the lcm of "+a+" "+"and"+" "+b+" "+factorial);
        
//     }
//     public static void lcm(int a,int b){
//         int i=0;
        
//         while(i<=b){
//             int factorial=i*a;
//             if(factorial%b==0);
            
//             i++;
//         }
//         System.out.println(factorial);
//     }
// } 

// import java.util.Scanner;
// public class shorthand{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the length of the array");
//         int size=sc.nextInt();
//         int[] arr=new int[size];
//         for(int i=0;i<size;i++){
//             System.out.print("enter the element at index = "+i +" ");
//             arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]);
//             System.out.print(" ");
//         }
    
//     }
// }

import java.util.Scanner;
public class shorthand{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("enter the element at index = "+i +" ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        int total=sum(arr);
        System.out.println("the totla sum is = "+total);
        double avg=avg(arr);
        System.out.println("the avg is = "+avg);
        
    }
    public static int sum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum +=arr[i];
        }
        return sum;
    }
    public static double avg(int[] arr){
       
        double avg=(double) sum(arr)/arr.length;
        return avg;
    }
    
}