class Solution 
{
    public static void bubbleSort(int[] arr)   // Sorting function
    {
        int n = arr.length;  // Array size

        // Outer loop: har pass ke liye
        // n-1 se start kar rahe kyunki har pass me ek element fix hota hai
        for(int i = n-1; i >= 0; i--)
        {
            // Inner loop: 0 se i-1 tak compare karega
            for(int j = 0; j <= i-1; j++)
            {
                // Adjacent comparison
                if(arr[j] > arr[j+1])
                {
                    // Swap logic
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Sorted array print
        System.out.println("After using Bubble sort: ");
        for(int i = 0; i < arr.length; i++)
        {
            int num = arr[i];
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
public class BubbleSort
{
    public static void main(String[] args) {

        int[] arr = {13,46,24,52,20,9};  // Input array

        System.out.println("Before using bubble sort-");

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        Solution.bubbleSort(arr);  // Function call
    }
}
    

