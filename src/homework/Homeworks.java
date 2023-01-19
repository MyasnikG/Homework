package homework;

public class Homeworks {

    public static void main(String[] args) {

        int num = 1;

        switch (num) {
            case 1:
                System.out.println("Monday - Dasi enq");
                break;
            case 2:
                System.out.println("Tuesday - Dasi chenq");
                break;
            case 3:
                System.out.println("Wednesday - dasi enq");
                break;
            case 4:
                System.out.println("Thursday - dasi chenq");
                break;
            case 5:
                System.out.println("Friday - dasi enq");
                break;
            case 6:
                System.out.println("Saturday - dasi chenq");
                break;
            case 7:
                System.out.println("Sunday - azat enq");
                break;
            default:
                System.out.println("There is no such day!");
        }


        int [] array = new int [10];
        int i = 0;
        while (i<array.length){ /*here I wrote array[i]<array.length and it caused exception*/
            array[i]=2;
            System.out.println("index number " + i + ": " + array[i]);
                i++;
        }

        System.out.println();
        int a=0;
        int [] newArray = new int [1000];
        while(a<newArray.length){
            newArray[a]=a+1;
            System.out.println("index number " + a + " " + newArray[a]);
            a++;
        }

        System.out.println();
        int b = 0;
        int c = -20;
        int[] myArray = new int [40];
        while(myArray[b]<myArray.length){
            if(c%2!=0){
                myArray[b]= c;
                System.out.println(c);
            }
            c++;
            b++;
            if(b==40){
                break;
            }
            }

        }

    }
