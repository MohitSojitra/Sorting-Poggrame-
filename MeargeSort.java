import java.util.Scanner;
public class MeargeSort
{
    public int[] temp;
    public void mearge(int arr[] , int l , int m , int h)
    {
        for(int a = l ; a <= h ; a ++)
        {
            temp[a] = arr[a];
        }
        int i = l;
        int j = m+1;
        int k = l;

        while(i <= m && j <= h)
        {
            if(temp[i] <= temp[j])
            {
                arr[k] = temp[i];
                i++;
            }
            else{
                arr[k] = temp[j];
                j++;
            }
            k++;
        }
        while(i <= m)
        {
            arr[k] = temp[i];
            i++;
            k++;
        }
    }
    public void devide(int[] arr , int l , int h)
    {
        if(l < h)
        {
            int mid = (l + h)/2;
            devide(arr , l , mid); // left part of the mid
            devide(arr , mid + 1 , h); // right part of the mid

            mearge(arr,l , mid , h);
        }
    }
    public void Mearge_Sort(int[] arr , int len)
    {
        temp = new int[len];
        devide(arr , 0 , len -1);
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
        MeargeSort ms = new MeargeSort();

        ms.Mearge_Sort(arr , len);
        System.out.println("\nAnswer is :- \n");
       
       for(int i = 0 ; i < len  ; i ++)
        {
            System.out.println(arr[i]);
        }
    }
}