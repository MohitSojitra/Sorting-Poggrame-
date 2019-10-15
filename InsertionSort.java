// time complexity  
//best case = O(n)
//Average case = O(n*n)
//worst case = O(n*n)
import java.util.Scanner;
public class InsertionSort
{
    public static void Insertion_sort(int arr[] , int len)
    {
        for(int i = 1 ; i <= len-1 ; i++)
        {
            int temp = arr[i-1];
            for(int j = i ; j >0 && temp > arr[j] ; j--)
            {
                if(arr[j] < arr[j-1])
                {
                    int t = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = t;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the element :- ");
        int len = sc.nextInt();
        int arr[] = new int[len];
        System.out.println("Plese enter the elements :- ");
        for(int i = 0 ; i < len  ; i ++)
        {
            arr[i] = sc.nextInt();
        }

        Insertion_sort(arr , len);
        System.out.println("\nAnswer is :- \n");
       
       for(int i = 0 ; i < len  ; i ++)
        {
            System.out.println(arr[i]);
        }
    }
}