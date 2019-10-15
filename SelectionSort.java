// time complexity  
//best case = O(n*n)
//Average case = O(n*n)
//worst case = O(n*n)



import java.util.Scanner;
public class SelectionSort
{
    public static int min(int[] arr , int k , int len)
    {
        int loc = k;
        int min = arr[k];
        for(int i = k+1; i < len ; i++)
        {
            if(min > arr[i])
            {
                loc = i;
                min = arr[i];
            }
        }
        return loc;
    }
    public static void Selection_sort(int[] arr , int len)
    {
        for(int i = 0 ; i < len-1 ; i++)
        {
            int loc = min(arr , i , len);
            int temp = arr[loc];
            arr[loc] = arr[i];
            arr[i] = temp;

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

        Selection_sort(arr , len);
        System.out.println("\nAnswer is :- \n");
       
       for(int i = 0 ; i < len  ; i ++)
        {
            System.out.println(arr[i]);
        }
    }
}