
//class Car{
//    protected String myCar = "BMW";
//
//    public String sayCarName() {
//        //System.out.println(myCar);
//    return myCar;
//    }
//}
//
//
//@FunctionalInterface
//interface myLamda {
//
//    public String runMe(Car car);
//
//}
//
//class myLamdatest {
//
//    public static String execute(myLamda lamda, Car car) {
//        String s = lamda.runMe(car);
//        return s;
//    }
//
//    public static void main(String [] args) {
//
//        System.out.println(
//        execute(new myLamda() {
//            @Override
//            public String runMe(Car car) {
//                //System.out.println("Worker вызван через анонимный класс");
//                return "Worker вызван через анонимный класс";
//            }
//        }, new Car())
//        );
//
//
//        // вызов метода doSomeWork через Lambda-выражения
//        // (нововведение Java 8)
// System.out.println(
//        execute((Car car) -> car.sayCarName(), new Car())
//        );
//
//
//    }
//}
//
//
//public class Main {}

import java.util.List;

class Car{
    protected String myCar = "BMW";
    protected int age;

    public Car() {
    }

    public Car(int age) {
        this.age = age;
    }

    public String sayCarName() {
       return myCar;
    }

    public int getAge() {
        return age;
    }
}


@FunctionalInterface
interface MyLambda {

    public String runMe(Car car);

}

class myLambdatest {

    public String execute(MyLambda lambda, Car car) {
        String s = lambda.runMe(car);
        return s;
    }

    public void sortList(SortLambda sortLambda, List<Car> list){
        for (Car c: list) {
            sortLambda.runMe(c);
        }
    }

}

@FunctionalInterface
interface SortLambda {

    public void runMe(Car car);

}






public class Main {}