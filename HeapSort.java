//Best case :- nlog(n)
//worst case :- nlog(n)
//Average case :- nlog(n)
import java.util.Scanner;
public class HeapSort
{
    public static void Heapify(int[] arr , int len)
    {
        for(int i = len-1 ; i >= 0 ;i--)
        {
            int k = i;
            while(k > 0)
            {
                if(arr[k] > arr[(k-1)/2])
                {
                    int t = arr[k];
                    arr[k] = arr[(k-1)/2];
                    arr[(k-1)/2] = t;
                    k = (k-1)/2;
                }
                else
                {
                    break;
                }
            }

        }
    }

    public static void Heap_Sort(int[] arr , int len)
    {
       for(int i = len-1 ; i >0 ; i--)
       {
           int t =arr[0];
           arr[0] = arr[i];
           arr[i] = t;

           Heapify(arr , i);
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

        Heapify(arr, len);
        Heap_Sort(arr , len);
        System.out.println("\nAnswer is :- \n");
       
       for(int i = 0 ; i < len  ; i ++)
        {
            System.out.println(arr[i]);
        }
    }
}