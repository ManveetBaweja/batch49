import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int sum =0;
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        for(int i=0;i< arr.length;i++){
            System.out.println("enter number");
            arr[i]= sc.nextInt();
        }
        for(int i=0;i< arr.length;i++){
            sum=sum+arr[i];

        }
        System.out.println(sum);
    }
}
