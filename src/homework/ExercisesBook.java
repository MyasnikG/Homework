package homework;

public class ExercisesBook {

    public static void main(String[] args) {

        //    Xndir number 21
        int a = 50;
        int b = 60;
        int c = 100;

        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

//        Xndir number 22
        if (a < b && a < c) {
            System.out.println(a);
        } else if (b < a && b < c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

//        Xndir number 23
        if (a == b || a == c || b == c) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

//       Xndir number 24
        if ((a == 2 && a == b) || (c == 2 && b == c) || (a == 2 && a == c)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

//        Xndir number 25
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("y=1");
        } else {
            System.out.println("y=2");
        }


//        Xndir number 26
        if(a%2==0 || b%2==0 || c%2==0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

//        Xndir number 27 - arthmetic progression
        if(c-b==b-a) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

//        Xndir number 28 - geometric progression
        if(c/b==b/a){ /*wrong solution, we need to have doubles instead of int s because we are working with division*/
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        double x = 10.5;
        double y = 25.78;
        double z = 100.99;
        if(z/y==y/x){
            System.out.println(true);
        }

//        Xndir number 29
        a=105;
        b=1009;
        c=70;
        if(a<b && b<c) {
            System.out.println(a + " " + b + " " + c);
        } else if (a<c && c<b) {
            System.out.println(a + " " + c + " " + b);
        } else if(b<a && a<c){
            System.out.println(b + " " + a + " " + c);
        } else if (b<c && c<a) {
            System.out.println(b + " " + c + " " + a);
        } else if (c<b && b<a) {
            System.out.println(c + " " + b + " " + a);
        } else if (c<a && a<b){
            System.out.println(c + " " + a + " " + b);
        }

        int max = 0;
        int middle = 0;
        int min = 0;


//        Xndir number 30
        a=51;
        b=47;
        c=99;
        if(a>b && b>c) {
            System.out.println(a + " " + b + " " + c);
        } else if (a>c && c>b) {
            System.out.println(a + " " + c + " " + b);
        } else if(b>a && a>c){
            System.out.println(b + " " + a + " " + c);
        } else if (b>c && c>a) {
            System.out.println(b + " " + c + " " + a);
        } else if (c>b && b>a) {
            System.out.println(c + " " + b + " " + a);
        } else if (c>a && a>b){
            System.out.println(c + " " + a + " " + b);
        }


    }


}
