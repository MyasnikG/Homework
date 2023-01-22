package homework;

public class Exercises61_70 {

    public static void main(String[] args) {

        int x = 4664;
        int temp = x/10;
        int last = x%10;
        int third = temp%10;
        int second = (temp/10)%10;
        int first=(temp/10)/10;
        System.out.println(temp + " " + last + " " + third + " " + second + " " + first);
        System.out.println("Exercise number 61");

        if(third + last == first + second){
            System.out.println(x + "true");
        } else {
            System.out.println(x + "false");
        }

        System.out.println();
//        number 62
        System.out.println("Exercise number 62");

        if(x>5000){
            System.out.println(x/(last + second));
        } else {
            System.out.println(x/(first + third));
        }

        System.out.println();
//        number 63
        System.out.println("Exercise number 63");
         x = 6781;
         temp = x/10;
         last = x%10;
         third = temp%10;
         second = (temp/10)%10;
         first=(temp/10)/10;

         if(last==1||third==1||second==1||first==1){
             System.out.println(1);
         } else {
             System.out.println(0);
         }

        System.out.println();
//         number 64
        System.out.println("Exercise number 64");

        char y;
        if(last + third == 5){
            System.out.println(y='s');
        } else {
            System.out.println(y='d');
        }

        System.out.println();
//        number 65
        System.out.println("Exercise number 65");
        x = 1562;
        temp = x/10;
        last = x%10;
        third = temp%10;
        second = (temp/10)%10;
        first=(temp/10)/10;

        if(last*third==12){
            System.out.println("y=12");
        } else {
            System.out.println("y=0");
        }


        System.out.println();
//        number 66
        System.out.println("Exercise number 66");
        x = 5561;
        temp = x/10;
        last = x%10;
        third = temp%10;
        second = (temp/10)%10;
        first=(temp/10)/10;
        if(last==1 || first==1){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        System.out.println();
//        number 67
        System.out.println("Exercise number 67");

        x = 2367;
        temp = x/10;
        last = x%10;
        third = temp%10;
        second = (temp/10)%10;
        first=(temp/10)/10;

        int z = last + third + second + first;
        if(x==(z*z)){
            System.out.println("YES");
        } else {
        System.out.println("NO");
        }

        System.out.println();
//        number 68
        System.out.println("Exercise number 68");

        if(last>second){
            System.out.println(last*second);
        } else {
            System.out.println(1);
        }

        System.out.println();
//        number 69
        System.out.println("Exercise number 69");

        x = 5979;
        temp = x/10;
        last = x%10;
        third = temp%10;
        second = (temp/10)%10;
        first=(temp/10)/10;
        z = last + third + second + first;

        if(z>20){
            System.out.println(y='1');
        } else {
            System.out.println(y='0');
        }

        System.out.println();
//        number 70
        System.out.println("Exercise number 70");

        int m = last * third * second * first;
        if(m>200){
            System.out.println(y='0');
        } else {
            System.out.println(y='1');
        }

        System.out.println();
        System.out.println("Array reverse rearrange homework");

        int [] array = {497, 863, 578, 465, 577, 2198, 4697, 4651, 1683};

        int [] reverseArray = new int[array.length];
        for(int i = 0; i<reverseArray.length;i++){
            int a = array[i];
            temp = a;
            int reverse = 0;
            while (temp>0){
                last = temp%10;
                reverse = (reverse*10)+last;
                temp/=10;
            }
            reverseArray[i]=reverse;
        }

        System.out.print("Original array ");
        for (int b: array){
            System.out.print(b + " ");
        }
        System.out.println();
        System.out.print("Reversed array ");
        for(int b: reverseArray) {
            System.out.print(b + " ");
        }

    }
}
