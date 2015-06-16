package pac1;

import com.sun.istack.internal.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Prefers if all values (ammortisation, coeff and cost) are fixed
enum Car{
    FORD(5, 5, 100),
    OPEL(10,3,200);

    Car(int ammortisation, int coeff, int repair) {
        this.ammortisationCost = ammortisation;
        this.coeff = coeff;
        this.repairCost = repair;
    }

    public int getAmmortisationCost() {
        return ammortisationCost;
    }

    public int getCoeff() {
        return coeff;
    }

    public int getRepairCost() {
        return repairCost;
    }

    private int ammortisationCost;
    private int coeff;
    private int repairCost;
}

class Travel {
    private List<Car> cars = new ArrayList<Car>();

    public Travel(@NotNull List<Car> cars) {
        this.cars = cars;
    }

    public void addCar(@NotNull Car car){
        if(cars == null){
            cars = new ArrayList<Car>();
        }
        cars.add(car);
    }

    public void doTravel() {
        for(Car car: cars){
            System.out.println(doTravel(car, someInnerLogic()));
        }
    }

    public static double doTravel(@NotNull Car car, float innerLogicResult){
        return (car.getAmmortisationCost() * car.getCoeff() + car.getRepairCost()) * innerLogicResult;
    }


    private float someInnerLogic() {
        return new Random().nextFloat() + 1;
    }

}