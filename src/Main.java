import di.Context;

public class Main {
    public static void main(String[] args) {
        Context context = new Context("config.xml");
        Car car = (Car) context.getBean("car");

        System.out.println(car);
    }
}