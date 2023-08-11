public abstract class Vehicle {

    private String passingno;
    private String manufacturer;

    public Vehicle(String passingno, String manufacturer){
        if (passingno.length() <= 10){
            this.passingno = passingno;
        }
            this.manufacturer = manufacturer;
    }

    public String getPassingno() {
        return passingno;
    }

    public void setPassingno(String passingno) {
        this.passingno = passingno;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void display(){

        //System.out.println("Passing No : " + passingno + "Manufacturer : " + manufacturer);
    }

    public abstract void start();
    public abstract void stop();
    public abstract void move();

}
