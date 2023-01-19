package homework;

public class Exercises31_40 {

    public static void main(String[] args) {

// number 31
        int a = 14570;
        int b = 95486;
        int c = 109973;
        int d = 71455;

        if (a > b && a > c && a > d) {
            System.out.println(a);
        } else if (b > a && b > c && b > d) {
            System.out.println(b);
        } else if (c > a && c > b && c > d) {
            System.out.println(c);
        } else if (d > a && d > b && d > c) {
            System.out.println(d);
        }


// number 32

        if (a < b && a < c && a < d) {
            System.out.println(a);
        } else if (b < a && b < c && b < d) {
            System.out.println(b);
        } else if (c < a && c < b && c < d) {
            System.out.println(c);
        } else if (d < a && d < b && d < c) {
            System.out.println(d);
        }

//        number 33
        if (a == b || a == c || a == d || b == c || b == d || c == d) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

//       number 34
        if (a + b == c + d || a + c == b + d || a + d == c + b) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

//        number 35
        a = 55199;
        b = 37894;
        c = 9630;
        d = 7675;
        if (a + b + c == d || a + b + d == c || a + c + d == b || b + c + d == a) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

//        number 36
        if ((a % 2 != 0 && b % 2 != 0) || (a % 2 != 0 && c % 2 != 0) || (a % 2 != 0 && d % 2 != 0) || (b % 2 != 0 && c % 2 != 0) || (b % 2 != 0 && d % 2 != 0)
                || (c % 2 != 0 && d % 2 != 0)) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }

//        number 37
        a = 100;
        b = 600;
        c = 1100;
        d = 1600;
        if (d - c == c - b && c - b == b - a) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

//        number 38
        if (d / c == c / b && c / b == b / a) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

//        number 39
        if (a < b && b < c && c < d) {
            System.out.println(a + " " + b + " " + c + " " + d);
        } else if (a < b && b < d && d < c) {
            System.out.println(a + " " + b + " " + d + " " + c);
        } else if (a < c && c < b && b < d) {
            System.out.println(a + " " + c + " " + d + " " + b);
        } else if (a < c && c < b && b < d) {
            System.out.println(a + " " + c + " " + b + " " + d);
        } else if (a < d && d < c && c < b) {
            System.out.println(a + " " + d + " " + c + " " + b);
        } else if (a < d && d < b && b < c) {
            System.out.println(a + " " + d + " " + b + " " + c);
        } else if (b < a && a < c && c < d) {
            System.out.println(b + " " + a + " " + c + " " + d);
        } else if (b < a && a < c && d < c) {
            System.out.println(b + " " + a + " " + d + " " + c);
        } else if (b < c && c < a && a < d) {
            System.out.println(b + " " + c + " " + a + " " + d);
        } else if (b < c && c < d && d < a) {
            System.out.println(b + " " + c + " " + d + " " + a);
        } else if (b < d && d < a && a < c) {
            System.out.println(b + " " + d + " " + a + " " + c);
        } else if (b < d && d < c && c < a) {
            System.out.println(b + " " + d + " " + c + " " + a);
        } else if (c < a && a < b && b < d) {
            System.out.println(c + " " + a + " " + b + " " + d);
        } else if (c < a && a < d && d < b) {
            System.out.println(c + " " + a + " " + d + " " + b);
        } else if (c < b && b < a && a < d) {
            System.out.println(c + " " + b + " " + a + " " + d);
        } else if (c < b && b < d && d < a) {
            System.out.println(c + " " + b + " " + d + " " + a);
        } else if (c < d && d < a && a < b) {
            System.out.println(c + " " + d + " " + a + " " + b);
        } else if (c < d && d < b && b < a) {
            System.out.println(c + " " + d + " " + b + " " + a);
        } else if (d < a && a < b && b < c) {
            System.out.println(d + " " + a + " " + b + " " + c);
        } else if (d < a && a < c && c < b) {
            System.out.println(d + " " + a + " " + c + " " + b);
        } else if (d < c && c < a && a < b) {
            System.out.println(d + " " + c + " " + a + " " + b);
        } else if (d < c && c < b && b < a) {
            System.out.println(d + " " + c + " " + b + " " + a);
        } else if (d < b && b < a && a < c) {
            System.out.println(d + " " + b + " " + a + " " + c);
        } else if (d < b && b < c && c < a) {
            System.out.println(d + " " + b + " " + c + " " + a);
        }

//number 40
        a=50;
        b=71;
        c=1005;
        d=-56;
        if (a > b && b > c && c > d) {
            System.out.println(a + " " + b + " " + c + " " + d);
        } else if (a > b && b > d && d > c) {
            System.out.println(a + " " + b + " " + d + " " + c);
        } else if (a > c && c > b && b > d) {
            System.out.println(a + " " + c + " " + d + " " + b);
        } else if (a > c && c > b && b > d) {
            System.out.println(a + " " + c + " " + b + " " + d);
        } else if (a > d && d > c && c > b) {
            System.out.println(a + " " + d + " " + c + " " + b);
        } else if (a > d && d > b && b > c) {
            System.out.println(a + " " + d + " " + b + " " + c);
        } else if (b > a && a > c && c > d) {
            System.out.println(b + " " + a + " " + c + " " + d);
        } else if (b > a && a > c && d > c) {
            System.out.println(b + " " + a + " " + d + " " + c);
        } else if (b > c && c > a && a > d) {
            System.out.println(b + " " + c + " " + a + " " + d);
        } else if (b > c && c > d && d > a) {
            System.out.println(b + " " + c + " " + d + " " + a);
        } else if (b > d && d > a && a > c) {
            System.out.println(b + " " + d + " " + a + " " + c);
        } else if (b > d && d > c && c > a) {
            System.out.println(b + " " + d + " " + c + " " + a);
        } else if (c > a && a > b && b > d)
            System.out.println(c + " " + a + " " + b + " " + d);
        else if (c > a && a > d && d > b) {
            System.out.println(c + " " + a + " " + d + " " + b);
        } else if (c > b && b > a && a > d) {
            System.out.println(c + " " + b + " " + a + " " + d);
        } else if (c > b && b > d && d > a) {
            System.out.println(c + " " + b + " " + d + " " + a);
        } else if (c > d && d > a && a > b) {
            System.out.println(c + " " + d + " " + a + " " + b);
        } else if (c > d && d > b && b > a) {
            System.out.println(c + " " + d + " " + b + " " + a);
        } else if (d > a && a > b && b > c) {
            System.out.println(d + " " + a + " " + b + " " + c);
        } else if (d > a && a > c && c > b) {
            System.out.println(d + " " + a + " " + c + " " + b);
        } else if (d > c && c > a && a > b) {
            System.out.println(d + " " + c + " " + a + " " + b);
        } else if (d > c && c > b && b > a) {
            System.out.println(d + " " + c + " " + b + " " + a);
        } else if (d > b && b > a && a > c) {
            System.out.println(d + " " + b + " " + a + " " + c);
        } else if (d > b && b > c && c > a) {
            System.out.println(d + " " + b + " " + c + " " + a);
        }

        System.out.println();
        int x = 10, y = -100, z = 8, m=99;
        int max = 0;
        int middle1 = 0;
        int middle2 = 0;
        int min = 0;

        if(x>y && x>z && x>m){
            max = x;
        } else if (x<y && y>z && y>m){
            max = y;
        } else if (z>x && z>y && z>m){
            max = z;
        } else {
            max = m;
        }

        if(x<y && x<z && x<m){
            min = x;
        } else if (x>y && y<z && y<m){
            min = y;
        } else if (z<x && z<y && z<m){
            min = z;
        } else {
            min = m;
        }

        if(x>min && x<max){
            middle1 = x;
        } else if (y>min && y<max){
            middle1 = y;
        } else if (z>min && z<max){
            middle1 = z;
        } else {
            middle1 = m;
        }

        if(x>min && x<max && x!=middle1){
            middle2 = x;
        } else if (y>min && y<max && y!=middle1){
            middle2 = y;
        } else if (z>min && z<max && z!=middle1){
            middle2 = z;
        } else if (m>min && m<max && m!=middle1) {
            middle2 = m;
        }


        if(middle1>middle2){
            System.out.println(min + " " + middle2 + " " + middle1 + " " + max);
        } else {
            System.out.println(min + " " + middle1 + " " + middle2 + " " + max);
        }

    }
}
