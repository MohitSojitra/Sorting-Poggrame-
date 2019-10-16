import java.util.Scanner;
public class QuickSort
{
    public static int partion(int[] arr , int i , int j)
    {
        int pivote = arr[i];
        int l = i;
        while(i < j)
        {
            do{
                i++;
            }while(arr[i] <= pivote);

            do{
                j--;
            }while(arr[j] > pivote);

            if(i <j)
            {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        int t = arr[j];
        arr[j] = arr[l];
        arr[l] = t;
        return j;
    }
    public static void Quick_Sort(int[] arr , int l , int h)
    {
        if(l < h)
        {
            int j = partion(arr ,l , h);
            Quick_Sort(arr, l, j);
            Quick_Sort(arr, j+1, h);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the element :- ");
        int len = sc.nextInt();
        int arr[] = new int[len+1];
        arr[len] = 100000;      //it work like infinity
        System.out.println("Plese enter the elements :- ");
        for(int i = 0 ; i < len  ; i ++)
        {
            arr[i] = sc.nextInt();
        }

        Quick_Sort(arr ,0 , len);
        System.out.println("\nAnswer is :- \n");

        for(int i = 0 ; i < len  ; i ++)
         {
             System.out.println(arr[i]);
         }
    }
}