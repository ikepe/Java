class Car
{
    int num;
    double gas;

    void show()
    {
        System.out.println("車のナンバーは" + num + "です");
        System.out.println("ガソリン量は" + gas + "です");
    }
}
public class L8_1 {
    public static void main (String[] args)
    {
        Car car1;
        Car car2;
        car1 = new Car();
        car2 = new Car();

        car1.num = 1234;
        car1.gas = 20.5;

        car2.num = 5678;
        car2.gas = 13.6;


        car1.show();
        car2.show();

        car1.gas = 0;

        car1.show();

    }
}
