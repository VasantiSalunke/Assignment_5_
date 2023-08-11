public class Main {
    public static void main(String[] args) {

        Car c1 = new Car("MH12PQ4565","Kia","Black",1,6);
        c1.display();
        CheckPost.checkvehicle(c1);

        Bus b1 = new Bus("MHB234524","Tata Motors",40);
        b1.display();
        CheckPost.checkvehicle(b1);
    }
}