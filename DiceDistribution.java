public class DiceDistribution {
    public static void main(String[] args) {
        System.out.println("Distribution of sums (6x6 matrix):");
        for (int dieA = 1; dieA <= 6; dieA++) {
            for (int dieB = 1; dieB <= 6; dieB++) {
                int sum = dieA + dieB;
                System.out.print(sum + "\t");
            }
            System.out.println(); // New row for each DieA value
        }
    }
}
