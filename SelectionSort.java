// is sorting me har pass me minimum element dhundho aur fir usko pehle unsorted element se swap krdo aise hi dusre iteration me firse minimum element dhundho aur second unsorted element se swap krdo
public class SelectionSort {   // Class declaration

    public static void selectionSort(int[] arr)  // Sorting function, array input lega
    {
        int n = arr.length;   // Array ka size store kar liya

        // Outer loop: har position ke liye chalega (0 se n-2 tak)
        for(int i = 0; i < n-1; i++)
        {
            int minIndex = i;  
            // Assume kar rahe hain ki current index hi minimum hai

            // Inner loop: i+1 se end tak check karega
            for(int j = i+1; j < n; j++)
            {
                // Agar current element se chhota element milta hai
                if(arr[j] < arr[minIndex])
                {
                    minIndex = j;   // Naya minimum index update
                }
            }

            // Swap logic
            int temp = arr[minIndex];   // Minimum value ko temp me store
            arr[minIndex] = arr[i];     // Current position par min value laa diya
            arr[i] = temp;              // Old value ko minIndex par daal diya
        }

        // Sorted array print kar rahe
        System.out.println("After selection sort:");
        for(int i = 0; i < arr.length; i++) 
        {
            int num = arr[i];
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {13,46,24,52,20,9};  // Input array

        System.out.println("Before selection sort:");

        // Original array print
        for(int i = 0; i < arr.length; i++)
        {
            int num = arr[i];
            System.out.print(num + " ");
        }

        System.out.println();

        // Sorting function call
        selectionSort(arr);
    }
}