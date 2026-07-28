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


import java.util.Scanner;
public class dsa{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the first number");
        int a=input.nextInt();
        System.out.println("enter the second number");
        int b=input.nextInt();
        System.out.println("the number is = "+a+b);

        //swaping
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println("the number is = "+a+b);
    }
}

