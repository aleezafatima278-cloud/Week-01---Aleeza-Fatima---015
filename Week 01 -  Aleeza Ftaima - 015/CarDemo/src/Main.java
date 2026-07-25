public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("bmw","black",45,true,70,false);
        Car tesla = new Car("tesla","white",80,true,100,true);

        System.out.println("BMW OLD DETAILS : ");
        System.out.println();
        bmw.displayState();
        bmw.increaseSpeed(45, 15);
        bmw.enableAutopilot();
        bmw.stopEngine();
        System.out.println("BMW NEW DETAILS : ");
        System.out.println();
        bmw.displayState();
        System.out.println();
        System.out.println("TESLA DETAILS : ");
        System.out.println();
        tesla.displayState();

    }
}
