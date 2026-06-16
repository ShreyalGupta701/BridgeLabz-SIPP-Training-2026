public class Frequency {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 4, 5, 3, 2};
        int n = arr.length;
        boolean[] visited = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            
            if (visited[i]) {
                continue;
            }
            
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println("Element: " + arr[i] + " | Frequency: " + count);
        }
    }
}