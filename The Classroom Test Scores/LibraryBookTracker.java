// 1. The Library Book Tracker 
// A library records the number of books borrowed each day for 7 days in an array.
// Use a loop to calculate the total number of books borrowed in the week.
// Find the day with the highest borrowings.
// Check if there was any day with zero borrowings (holiday).
// Display the average daily borrowings.

public class LibraryBookTracker {

    public static void main(String[] args) {
        int[] dailyBooksBorrowed = {45, 62, 58, 20, 85, 0, 71};
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int totalBooks = 0;
        int maxBooks = 0;
        int maxDayIndex = -1;
        boolean foundZeroBorrowing = false;

        for (int i = 0; i < dailyBooksBorrowed.length; i++) {
            totalBooks += dailyBooksBorrowed[i];

            if (dailyBooksBorrowed[i] > maxBooks) {
                maxBooks = dailyBooksBorrowed[i];
                maxDayIndex = i;
            }

            if (dailyBooksBorrowed[i] == 0) {
                foundZeroBorrowing = true;
            }
        }

        System.out.println("--- Library Book Borrowing Report ---");
        System.out.println("Total books borrowed in the week: " + totalBooks);
        
        if (maxDayIndex != -1) {
            System.out.println("The day with the highest borrowings was " + daysOfWeek[maxDayIndex] + " with " + maxBooks + " books.");
        }
        
        if (foundZeroBorrowing) {
            System.out.println("There was at least one day with zero borrowings (holiday).");
        } else {
            System.out.println("There were no days with zero borrowings.");
        }
        
        double averageBorrowings = (double) totalBooks / dailyBooksBorrowed.length;
        System.out.printf("Average daily borrowings: %.2f\n", averageBorrowings);
    }
}
