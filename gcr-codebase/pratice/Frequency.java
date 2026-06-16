public class frequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4, 2};

        int[] freq = new int[10]; 

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " occurs " + freq[i] + " times");
            }
        }
    }
}