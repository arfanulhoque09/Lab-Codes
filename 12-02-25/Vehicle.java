class Vehicle {
    protected String brand = "BMW";

    public void honk() {
        System.out.println("toki, toki!");
    }
}

class Car extends Vehicle {
    private String modelName = "12 th series";

    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.honk();
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}


