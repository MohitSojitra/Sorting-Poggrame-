//best case = O(n)
//avearge case = O(n*n)
//worst case = O(n*n)


import java.util.Scanner;
public class BubbleSort
{
    public static void BubbleSort( int arr[] , int len)
    {
        for(int round = 1 ; round <= len - 1 ; round++)
        {
            for(int i = 0; i <= len - 1 - round ; i++)
            {
                if(arr[i] > arr[i + 1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
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

       BubbleSort(arr , len);
       System.out.println("\nAnswer is :- \n");
       
       for(int i = 0 ; i < len  ; i ++)
        {
            System.out.println(arr[i]);
        }

    }
}