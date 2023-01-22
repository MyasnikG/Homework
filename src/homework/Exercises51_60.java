package homework;

public class Exercises51_60 {
    public static void main(String[] args) {

//      number 51
        System.out.println("Exercise number 51");
        int x = 189;
        int temp = x;
        int last = x%10;
        temp/=10;
        int second = temp%10;
        int first = temp/10;
        if(first+second==last){
            System.out.println(true + " because " + first + " + " + second + " = " + last);
        } else {
            System.out.println(false + " because " + first + " + " + second + " != " + last);
        }
        System.out.println();
//      number 52
        System.out.println("Exercise number 52");
        temp = x = 577;
        temp/=10;
        last = x%10;
        second = temp%10;
        first = temp/10;
        if(first==second || second==last || first==last){
            System.out.println(x + " true");
        } else {
            System.out.println(x + " false");
        }

        System.out.println();

//        number 53
        System.out.println("Exercise number 53");
        temp = x = 957;
        int k = 579;
        temp/=10;
        last = x%10;
        second = temp%10;
        first = temp/10;

        if(x>k){
            System.out.println(x/(first+second+last));
        } else {
            System.out.println(x/last);
        }

        System.out.println();

//      number 54
        System.out.println("Exercise number 54 and 55");
        temp = x = 893;
        temp/=10;
        last = x%10;
        second = temp%10;
        first = temp/10;

        if(first > second && first > last) {
            System.out.println(x + " greatest number is " + first);
        } else if (second > first && second > last) {
            System.out.println(x + " greatest number is " + second);
        } else {
            System.out.println(x + " greatest number is " + last);
        }

        if(first < second && first < last) {
            System.out.println(x + " smallest number is " + first);
        } else if (second < first && second < last) {
            System.out.println(x + " smallest number is " + second);
        } else {
            System.out.println(x + " smallest number is " + last);
        }

        System.out.println();
//        number 56
        System.out.println("Exercise number 56");
        temp = x = 579;
        temp/=10;
        last = x%10;
        second = temp%10;
        first = temp/10;
        if(last > second) {
            System.out.println(x/(first + second + last));
        } else {
            System.out.println(x);
        }

        System.out.println();
//        number 57
        System.out.println("Exercise number 57");
        temp = x = 238;
        temp/=10;
        last = x%10;
        second = temp%10;
        first = temp/10;
        if(x>300){
            System.out.println((double)second/last);
        } else {
            System.out.println((double)first/last);
        }

        System.out.println();
//        number 58
        System.out.println("Exercise number 58");
        char f;
        temp = x = 128;
        temp/=10;
        last = x%10;
        second = temp%10;
        first = temp/10;
        if(second + first < 5){
            f='a';
            System.out.println(f);
        } else {
            f='b';
            System.out.println(f);
        }


        System.out.println();
//        number 59 & 60
        System.out.println("Exercise number 59 & 60");
        temp = x = 537;
        temp/=10;
        last = x%10;
        second = temp%10;
        first = temp/10;
        int max = 0, middle = 0, min = 0;

        if(first > second && first > last)  {
            max=first;
        } else if (second > first && second > last) {
            max = second;
        } else {
            max = last;
        }

        if(first < second && first < last) {
            min = first;
        } else if (second < first && second < last) {
            min = second;
        } else {
            min = last;
        }

        if (first > second && first < last) {
            middle = first;
        } else if (second > first && second < last){
            middle = second;
        } else {
            middle = last;
        }

        System.out.println("From greatest to smallest " + max + " " + middle + " " + min);
        System.out.println("From smallest to greatest " + min + " " + middle + " " + max);







    }

}
