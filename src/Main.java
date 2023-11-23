import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = getArrayMember(getArraySize());
        printArray(arr);

        System.out.print("Sorting Array.....\n");
        Arrays.sort(arr);
        System.out.print("Completed");
        printArray(arr);
    }

    public static int getArraySize(){
        int n;
        while(true){
            Scanner s = new Scanner(System.in);
            System.out.print("Enter array size: ");
            n = s.nextInt();

            if(n>0) break;
            else    System.out.print("\n .......Invalid number please enter your array size again \n\n");
        }
        return n;
    }
    public static int[] getArrayMember(int n){
        int[] arr = new int[n];
        System.out.print("Enter array member(s): \n");
        for(int i=0;i<n;i++){
            Scanner s = new Scanner(System.in);
            System.out.print((i+1)+". ");
            arr[i] = s.nextInt();
        }
        return arr;
    }
    public static void printArray(int[] arr){
        System.out.print("\n\nShow array\n");
        for (int j : arr) System.out.print("\n" + j);
        System.out.print("\n\n------------------------\n\n");
    }
}
