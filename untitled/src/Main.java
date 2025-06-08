public static int[] reverseArray(int[] array) {
    int[] reversed = new int[array.length];
    for (int i = 0; i < array.length; i++) {
        reversed[i] = array[array.length - 1 - i];
    }
    return reversed;
}

