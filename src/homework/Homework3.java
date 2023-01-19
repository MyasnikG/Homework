package homework;

public class Homework3 {

    public static void main(String[] args) {


//        Task 3. Create an array and print all odd elements of range -20:20
        System.out.println("Task 3");
        int c = 0;
        for (int i = -20; i < 21; i++) {
            if (i % 2 != 0) {
                c++;
            }
        }
        int[] array = new int[c];

        for (int i = 0, j = -19; i < array.length; i++, j += 2) {
            array[i] = j;
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println();

//        Task 4. Create an array and print all elements which can be divided by 5
        System.out.println("Task 4");
        int[] array1 = {90, 25, -650, 86, 115, 394, 567, -10, 5, 0};

        for (int x : array1) {
            if (x % 5 == 0) {
                System.out.println(x);
            }
        }


        System.out.println();
//       Task 5. Create an array and print all elements which are between 24.12 and 467.23

        System.out.println("Task 5");
        double[] array2 = {45.8, 89, 4 - 56.9, 50.0, 63.89, 1009.8, 861.65, 25.6, 877.5, 467.20, 55.0, 100.9};

        for (double x : array2) {
            if (x >= 24.12 && x <= 467.23) {
                System.out.println(x);
            }
        }

        System.out.println();
//        Task 6. Create an array and print count of elements which can be divided by 2
        System.out.println("Task 6");
        int[] array3 = {5, 10, 97, 58, 61, 12, -555, 462, 800, -30, -102, 129, 1000};
        int count = 0;
        for (int i = 0; i < array3.length; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
        
        System.out.println();

//        Task 7. Print its first 10 multiples.

        System.out.println("Task 7");
        int n = 10;

        for (int i = 1; i < 11; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

    }
}
