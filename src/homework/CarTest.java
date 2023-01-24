package homework.oop;

public class CarTest {

    public static void main(String[] args) {

        Car car1 = new Car ();

        car1.setMark("BMW");
        car1.setModel("760i");
        car1.setColor("White");
        car1.setPrice(114595);
        car1.setProductionYear(2023);
        car1.setLogo('\u00A9');
        car1.setAutomatic(true);
        car1.setEnginePower(536);

        Car car2 = new Car();

        car2.setMark("Mercedes-Benz");
        car2.setModel("EQS");
        car2.setProductionYear(2022);
        car2.setPrice(102310);
        car2.setEnginePower(329);
        car2.setColor("Gray");
        car2.setLogo('&');
        car2.setAutomatic(true);

        System.out.println("First car is " + car1.getMark() + " " + car1.getModel() + " " + car1.getProductionYear() + " " + car1.getColor() + " "+ car1.getPrice() + "USD"
        + " Engine power is " + car1.getEnginePower() + " horsepower" + " and logo is " + car1.getLogo());

        System.out.println();
        System.out.println("Second car is " + car2.getMark() + " " + car2.getModel() + " " + car2.getProductionYear() + " " + car2.getColor() + " "+ car1.getPrice() + "USD"
                + " Engine power is " + car2.getEnginePower() + " horsepower" + " and logo is " + car2.getLogo());

    }
}
