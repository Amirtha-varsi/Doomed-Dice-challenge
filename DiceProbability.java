public public class Dice {
    public static void main(String[] args) {
        int totalCombinations = 36; // Since 6x6 = 36 possible rolls
        int[] sumFrequency = new int[13]; // To store frequency of sums (index represents sum)

        // Count occurrences of each sum
        for (int dieA = 1; dieA <= 6; dieA++) {
            for (int dieB = 1; dieB <= 6; dieB++) {
                int sum = dieA + dieB;
                sumFrequency[sum]++; // Increment count for this sum
            }
        }

        // Display probability of each sum
        System.out.println("Sum\tFrequency\tProbability");
        for (int sum = 2; sum <= 12; sum++) {
            double probability = (double) sumFrequency[sum] / totalCombinations;
            System.out.printf("%d\t%d\t\t%.4f%n", sum, sumFrequency[sum], probability);
        }
    }
}{

}
