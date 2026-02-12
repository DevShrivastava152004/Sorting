class Solution
 {
    public static void bubbleSort(int[] arr)
    {
        int n = arr.length;
        for(int i = n-1; i>=0 ; i--)
        {
            for(int j = 0; j<=i-1;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("After using Bubble sort: ");
        for(int i = 0;i<arr.length;i++)
        {
            int  num = arr[i];
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
public class BubbleSort
    {
    public static void main(String[] args) {
        int[] arr= {13,46,24,52,20,9};
        System.out.println("Before using bubble sort-");
        {
            for(int i=0;i<arr.length;i++)
            {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            
            Solution.bubbleSort(arr);
            
        }
    }
}
    

