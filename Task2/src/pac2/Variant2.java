package pac2;

import com.sun.istack.internal.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Prefers if methods from Car interface contain some logic depends on car type
interface Car {
    public int amortizationCost();
    public int repairCost();
    public int koeff();
}

class Ford implements Car {
    @Override
    public int amortizationCost() {
        return 5;
    }

    @Override
    public int repairCost() {
        return 100;
    }

    @Override
    public int koeff() {
        return 5;
    }
}

class Opel implements Car {
    @Override
    public int amortizationCost() {
        return 10;
    }

    @Override
    public int repairCost() {
        return 200;
    }

    @Override
    public int koeff() {
        return 3;
    }
}


class Travel {
    private List<Car> cars = new ArrayList<Car>();

    public Travel(@NotNull List<Car> cars) {
        this.cars = cars;
    }

    public void addCar(@NotNull Car car) {
        if (cars == null) {
            cars = new ArrayList<Car>();
        }
        cars.add(car);
    }

    public void doTravel() {
        for (Car car : cars) {
            System.out.println(doTravel(car, someInnerLogic()));
        }
    }

    public static double doTravel(@NotNull Car car, float innerLogicResult) {
        return (car.amortizationCost() * car.koeff() + car.repairCost()) * innerLogicResult;
    }


    private float someInnerLogic() {
        return new Random().nextFloat() + 1;
    }
}
