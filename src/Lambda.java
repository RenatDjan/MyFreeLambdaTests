import java.util.ArrayList;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        Car car = new Car();

        MyLambda lambda = new MyLambda() {
            @Override
            public String runMe(Car car) {
                return car.sayCarName();
            }
        };

        MyLambda lambda1 = car1 -> car1.sayCarName();

        myLambdatest lambdatest = new myLambdatest();

        System.out.println(lambdatest.execute(lambda1, car));

        List<Car> list = new ArrayList<Car>();
        list.add(new Car(1));
        list.add(new Car(2));
        list.add(new Car(3));
        list.add(new Car(4));
        list.add(new Car(5));

        SortLambda lambda2 = car2 -> System.out.println((car2.getAge() > 4? car2.getAge():""));
        lambdatest.sortList(lambda2, list);
        System.out.println("just");
        System.out.println("just");

        System.out.println("just");
        System.out.println("just");

    }


}
