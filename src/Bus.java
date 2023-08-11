public class Bus extends Vehicle{

    private int capacity;

    public Bus(String passingno, String manufacturer, int capacity ){
        super(passingno, manufacturer);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void display(){
        super.display();
        System.out.println("Bus Passing No : " + getPassingno() + '\n' + "Bus Manufacturer : " + getManufacturer() + '\n'
                + "Capacity Of Bus : " + getCapacity() );
    }

    @Override
    public void start() {
        System.out.println("Start the Bus");
    }

    @Override
    public void stop() {
        System.out.println("Stop the Bus");
    }

    @Override
    public void move() {
        System.out.println("Move the Bus");
    }
}
