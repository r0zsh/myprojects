public class Main {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 34, 12, 67, 65, 0, 11, 46, 9};
        int target = 8;
        int result = binarySearch(arr, target);
        System.out.println("Index of target: " + result);
    }
}