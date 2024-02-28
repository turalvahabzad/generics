public class MyCar<T extends AbstractCar> {

    private final T car;

    public MyCar(T car){
        this.car=car;
    }
    public T getCar(){
        return car;
    }

public void drive(){
        car.drive();

}
    public void saveToFile(){

    }
}
