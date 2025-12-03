
import java.util.*;

public class ActivitySolutions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Keep asking until user types 1–100
        int num;
        do {
            System.out.print("Enter a number between 1 and 100: ");
            num = sc.nextInt();
        } while (num < 1 || num > 100); // repeat if out of range


        // 2. Count how many times 7 appears in the array
        int[] arr2 = {3, 7, 1, 7, 9, 7, 2, 4, 7, 10};
        int count7 = 0;
        for (int x : arr2) {
            if (x == 7) count7++;
        }


        // 3. Print a triangle of stars (1–5)
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // new line after each row
        }


        // 4. Find smallest and largest in one scan
        int[] arr4 = {12, 5, 99, -3, 25};
        int smallest = arr4[0];
        int largest = arr4[0];

        for (int x : arr4) {
            if (x < smallest) smallest = x;
            if (x > largest) largest = x;
        }


        // 5. Stop the loop early when a value is found
        int[] arr5 = {5, 8, 12, 20, 55};
        for (int x : arr5) {
            if (x == 20) break; // exit when 20 is found
        }


        // 6. Average of odd numbers only
        int[] arr6 = {3, 10, 15, 22, 9};
        int oddSum = 0;
        int oddCount = 0;

        for (int x : arr6) {
            if (x % 2 != 0) { // odd check
                oddSum += x;
                oddCount++;
            }
        }
        double oddAvg = (oddCount > 0) ? (double) oddSum / oddCount : 0;


        // 7. Turn negatives into positive values
        int[] arr7 = {-5, 12, -3, 9};
        for (int i = 0; i < arr7.length; i++) {
            if (arr7[i] < 0) arr7[i] *= -1;
        }


        // 8. Copy A into B
        int[] A = {1, 2, 3, 4, 5};
        int[] B = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i]; // simple copy
        }


        // 9. Add numbers until user enters 0
        int sum = 0;
        int input;
        do {
            System.out.print("Enter a number (0 stops): ");
            input = sc.nextInt();
            sum += input;
        } while (input != 0);


        // 10. Find index of first even number
        int[] arr10 = {9, 7, 3, 14, 5};
        int firstEvenIndex = -1; // default if no even number exists

        for (int i = 0; i < arr10.length; i++) {
            if (arr10[i] % 2 == 0) {
                firstEvenIndex = i;
                break;
            }
        }


        // 11. Print only even-index elements
        int[] arr11 = {10, 20, 30, 40, 50, 60};
        for (int i = 0; i < arr11.length; i += 2) {
            System.out.println(arr11[i]);
        }


        // 12. Check if a value appears 3 times or more
        int[] arr12 = {5, 7, 5, 1, 5, 3};
        int target = 5;
        int occ = 0;

        for (int x : arr12) {
            if (x == target) occ++;
            if (occ == 3) break; // once it hits 3, no need to continue
        }


        // 13. Count students who passed and failed
        int[] grades = {80, 50, 75, 90, 60};
        int pass = 0;
        int fail = 0;

        for (int g : grades) {
            if (g >= 75) pass++;
            else fail++;
        }


        // 14. Print array backwards
        int[] arr14 = {1, 2, 3, 4, 5};
        for (int i = arr14.length - 1; i >= 0; i--) {
            System.out.print(arr14[i] + " ");
        }


        // 15. Ask user for 5 numbers, print only >50
        int[] arr15 = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr15[i] = sc.nextInt();
        }

        for (int x : arr15) {
            if (x > 50) System.out.println(x);
        }


        // 16. Count digits of a number
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int digitCount = 0;
        int temp = Math.abs(n); // handle negatives

        while (temp > 0) {
            temp /= 10;
            digitCount++;
        }


        // 17. Find second highest without sorting
        int[] arr17 = {10, 50, 20, 80, 40};
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int x : arr17) {
            if (x > highest) {
                secondHighest = highest;
                highest = x;
            } else if (x > secondHighest && x != highest) {
                secondHighest = x;
            }
        }


        // 18. Check if array has duplicates
        int[] arr18 = {3, 5, 2, 3, 8};
        boolean hasDuplicate = false;

        for (int i = 0; i < arr18.length; i++) {
            for (int j = i + 1; j < arr18.length; j++) {
                if (arr18[i] == arr18[j]) {
                    hasDuplicate = true;
                    break;
                }
            }
        }


        // 19. Match student names to their grades
        String[] names = {"Ana", "Ben", "Chris"};
        int[] gradeList = {90, 85, 88};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " - " + gradeList[i]);
        }


        // 20. Print even numbers greater than 20
        int[] arr20 = {10, 22, 30, 17, 40};
        for (int x : arr20) {
            if (x % 2 == 0 && x > 20) {
                System.out.println(x);
            }
        }

        sc.close();
    }
}
