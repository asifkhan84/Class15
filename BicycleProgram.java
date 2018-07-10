public class BicycleProgram {
    public static void main(String[] args) {
        Bicycle bike1 = new Bicycle(50, "Red", 100);
        Bicycle bike2 = new Bicycle();
        bike1.accelerate(60);
        bike1.brake(51);
        System.out.println(bike1);
        System.out.println(bike2);
    }
}
