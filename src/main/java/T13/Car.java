package T13;

public class Car {
    double carPrice;
    String color;

    public Car(double carPrice, String color){
        this.carPrice = carPrice;
        this.color = color;
    }

    public Car(double carPrice) {
        this.carPrice = carPrice;
    }

    public double calculateSalePrice(){
        return  carPrice;
    }
}

class Sedan extends Car{
    float length;

    public Sedan(double carPrice, float length) {
        super(carPrice);
        this.length = length;
    }

    @Override
    public double calculateSalePrice() {
        if(length > 20){
            return carPrice - ((carPrice / 100) * 5);
        } else
            return carPrice - ((carPrice / 100) * 10);
    }
}

class  Truck extends Car{
    float weight;

    public Truck(double carPrice, float weight){
        super(carPrice);
        this.weight = weight;
    }

    @Override
    public double calculateSalePrice() {
        if(weight > 2000){
            return carPrice - ((carPrice / 100) * 10);
        } else
            return carPrice - ((carPrice / 100) * 20);
    }
}

class CarTest{
    public static void main(String[] args) {
        Car[] car = {new Truck(20000, 2500), new Sedan(30000, 34)};

        for (Car c: car) {
            System.out.println(c.calculateSalePrice());
        }
    }
}


