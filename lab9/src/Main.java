public class Main {

    public static int[][] mergeArrays(int[][] arr1, int[][] arr2)
    {
        int[][] arr3 = new int[2][arr1.length];
        for (int i = 0; i < arr1.length; i++)
        {
            arr3[0][i] = arr1[0][i];
            arr3[1][i] = arr2[1][i];
        }
        return arr3;
    }

    public static void printArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {

        for (int j = 0; j < arr.length; j++) {
        System.out.print(arr[j] + " ");}

        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        int[] arr1 = {9, 67, 3,677, -1, 1,5};
        int[] arr2 = {9, 67, 3,677, -1, 1,5};
        printArray(mergeArrays(arr1,arr2));


    }
}