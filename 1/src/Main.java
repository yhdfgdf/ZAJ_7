import java.util.ArrayList;

import java.util.Collections;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList <Car> cars = new ArrayList<Car>();

        cars.add(new Car("Golf", 1999));
        cars.add(new Car("Astra", 2010));
        cars.add(new Car("Corsa", 2005));
        cars.add(new Car("XC60", 2002));
        cars.add(new Car("Julia", 2013));
        cars.add(new Car("Corvet", 2008));
        cars.add(new Car("Urus", 2023));
        cars.add(new Car("Yaris", 2001));
        cars.add(new Car("Corola", 1995));
        cars.add(new Car("RS6", 2020));



        for(Car car: cars){
            System.out.println(car.year + " " + car.model);
        }

        System.out.println("---");

        Collections.sort(cars);



        for(Car car: cars){
            System.out.println(car.year + " " +  car.model);
        }

    }
}