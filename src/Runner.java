public class Runner {

    public static void main(String[] args){
        Car kianCar = new Car(2019, "Toyota", 0, "Prius");
        System.out.println(kianCar.toString());
        kianCar.drive(10);
        System.out.println(kianCar.toString());
        Rectangle kianeRect = new Rectangle(10,10);
        System.out.println(kianeRect.getArea());
        System.out.println(kianeRect.getDiagonal());
        System.out.println(kianeRect.isSquare());
    }

}