import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        if (!input.hasNextInt()) return;
        int n = input.nextInt();
        if(n==0 || n==1){
            System.out.print("EMPTY");
            return;
        }
        
        // Arrays to track unique batches and their lowest scores
        int[] uniqueBatches = new int[n];
        int[] minScores = new int[n];
        int uniqueCount = 0; // Tracks how many unique eligible batches we find
        
        for (int i = 0; i < n; i++) {
            int batch = input.nextInt();
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            
            // Condition: include rows with a + c > 0
            if (a + c > 0) {
                int score = a - (2 * b) + c;
                
                // Check if we have already seen this batch ID
                int foundIndex = -1;
                for (int j = 0; j < uniqueCount; j++) {
                    if (uniqueBatches[j] == batch) {
                        foundIndex = j;
                        break;
                    }
                }
                
                if (foundIndex == -1) {
                    // New batch encountered: save it and its score
                    uniqueBatches[uniqueCount] = batch;
                    minScores[uniqueCount] = score;
                    uniqueCount++;
                } else {
                    // Existing batch: update if this score is smaller
                    if (score < minScores[foundIndex]) {
                        minScores[foundIndex] = score;
                    }
                }
            }
        }
        
        // Sort both arrays by batch ID in ascending order (Bubble Sort)
        for (int i = 0; i < uniqueCount - 1; i++) {
            for (int j = 0; j < uniqueCount - i - 1; j++) {
                if (uniqueBatches[j] > uniqueBatches[j + 1]) {
                    // Swap batch IDs
                    int tempBatch = uniqueBatches[j];
                    uniqueBatches[j] = uniqueBatches[j + 1];
                    uniqueBatches[j + 1] = tempBatch;
                    
                    // Swap corresponding min scores to keep them matched
                    int tempScore = minScores[j];
                    minScores[j] = minScores[j + 1];
                    minScores[j + 1] = tempScore;
                }
            }
        }
        
        // Print the sorted result for each eligible batch
        for (int i = 0; i < uniqueCount; i++) {
            System.out.println(uniqueBatches[i] + " " + minScores[i]);
        }
    }
}
