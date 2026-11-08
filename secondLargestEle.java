import java.util.Scanner;
public class secondLargestEle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of the array");
        int size=sc.nextInt(); 
        int[] arr=new int[size];

        System.out.println("enter the elements of the array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");


        }
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
            

        }
        System.out.println("max = "+max);

        int smax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>smax && arr[i]!=max) smax=arr[i];

        }
        System.out.println("smax = "+smax);
        System.out.println("smax = "+smax);



    }
    
}
