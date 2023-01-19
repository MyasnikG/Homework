public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        System.out.println('\u0026');

        int x = 5;
        int y = 4;

        x++; /* x=6 */
        y = ++x; /* y=7,  x = 7 */
        System.out.println(x + " and " + y);
        int z = ++x - --y; /* 8-6 = 2*/

        System.out.println(x++);
        System.out.println("now x is " + x);
        System.out.println(y-- + x++);/*6+9*/
        System.out.println(--z);/* 1*/

//        8   15   1


//        y = x > 0 ? 1 : 2;
//        y = x > 0 ? 1 : x < 0 ? 3 : 2;


        x = -2;
        y = x > 0 ? 5: 6;
        System.out.println(x > 0 ? "positive" : "not positive");


        for (int i = 1, j = 2; i < 3; i++, j*=2) {
            System.out.println(i+j);
        }

         z = 0;
        int [] array = new int [10];
        while(z<array.length){
            System.out.println(array[z]);
            z++;
        }

    }
}