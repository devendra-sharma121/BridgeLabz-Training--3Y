// 4. The Classroom Test Scores 
// A teacher records the marks of 12 students in an array.
// Use a loop to calculate the class average.
// Find the highest and lowest marks.
// Count how many students scored above the average.
// Display a message if any student scored below passing marks (say 40).


public class ClassroomTestScores {
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 65, 59, 95, 88, 72, 45, 38, 81, 76};
        int totalScore = 0;
        int highestScore = scores[0];
        int lowestScore = scores[0];
        int aboveAverageCount = 0;
        boolean hasFailingStudent = false;

        for (int score : scores) {
            totalScore += score;
            if (score > highestScore) {
                highestScore = score;
            }
            if (score < lowestScore) {
                lowestScore = score;
            }
            if (score < 40) {
                hasFailingStudent = true;
            }
        }

        double averageScore = (double) totalScore / scores.length;

        for (int score : scores) {
            if (score > averageScore) {
                aboveAverageCount++;
            }
        }

        System.out.println("Class Average: " + String.format("%.2f", averageScore));
        System.out.println("Highest Score: " + highestScore);
        System.out.println("Lowest Score: " + lowestScore);
        System.out.println("Students who scored above average: " + aboveAverageCount);
        if (hasFailingStudent) {
            System.out.println("Attention: One or more students scored below the passing mark of 40.");
        }
    }
}
