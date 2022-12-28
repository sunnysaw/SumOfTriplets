import java.util.Scanner;

/*
In this section we will see how we can find the sum of three number which is equal to the value of x.
_______________________________________________________________________________________________________
Question : count the number of triplet who sum is equal to given value x.
___________________________________________________________________________
Approach : first we take array value by user than we will take x value and after that by the help of loop we will
           go through all the index of array and added the value to each other and check whether the value
           is equal to x or not if it is equal to x we will print count.
______________________________________________________________________________________________________________________
 */
class triplet{
    static int target(int arr[] , int x){
        int count =0;
        int arrays =0;
        for (int i =0; i < arr.length;i++){
            for (int j = i +1; j < arr.length; j++){
                for (int k = j + 1; k < arr.length; k++){
                    if (arr[i] + arr[j] + arr[k] == x){
                        count++;
                     }
                }
            }
        }
        return (count + arrays);

    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int a = sc.nextInt();
        int arr[] = new int[a];
        System.out.println("Enter the value you want put inside in array : ");
        for (int i =0; i < arr.length; i++){
         arr[i] = sc.nextInt();
            System.out.println("Printing the value of array : " + arr[i]);
        }
        System.out.println("Enter the value you want to check the triplet : ");
        int x = sc.nextInt();
        System.out.println("Printing the count value of triplets :" + triplet.target(arr, x));
    }
}