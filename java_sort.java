class InsertionSort {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (arr[j] > temp) {
                arr[j+1] = arr[j];
                if (j == 0) {
                    arr[j] = temp;
                }
                else {
                    arr[j] = temp;
                    j = j - 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        long start_time = System.currentTimeMillis();

        int[] arr = new int[10000];
        for (int index = 0; index < arr.length; index++) {
            arr[index] = 10000 - index;
        }

        insertionSort(arr);

        long end_time = System.currentTimeMillis();

        float sec = (end_time - start_time) / 1000F;
        System.out.println(sec + " seconds for Java");
    }
}