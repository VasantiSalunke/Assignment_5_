public class Car extends Vehicle{

    private String color;
    private byte fueltype;
    private String fueltype1;
    private int noofgears;

    public Car(String passingno, String manufacturer, String color, int fueltype,int noofgears){
        super(passingno, manufacturer);
        this.color = color;

        if (fueltype == 1){
            this.fueltype = (byte) fueltype;
            this.fueltype1 = "Petrol";
        }
        else if (fueltype == 2){
            this.fueltype = (byte) fueltype;
            this.fueltype1 = "Diesel";
        }
        this.noofgears = noofgears;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNoofgears() {
        return noofgears;
    }

    public void setNoofgears(int noofgears) {
        this.noofgears = noofgears;
    }

    public void display(){
        super.display();
        System.out.println("Car Passing No : " + getPassingno() + '\n' + "Car Manufacturer : " + getManufacturer() + '\n' + "Car Color : " + color +
        '\n' + "Car fuel type : " + fueltype1 + '\n' + "No of Gears : " + noofgears);
    }

    @Override
    public void start() {
        System.out.println("Start the car");
    }

    @Override
    public void stop() {
        System.out.println("Stop the car");
    }

    @Override
    public void move() {
        System.out.println("Move the car");
    }
}
