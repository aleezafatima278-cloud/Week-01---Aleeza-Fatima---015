public class Main {
    public static void main(String[] args) {
        Calculator casio = new Calculator(12,15);
        System.out.println(casio.add(12, 1));
        System.out.println(casio.divide(12, 8));
        System.out.println(casio.modulus(5, 3));
        System.out.println(casio.power(2, 3));
        
    }
}
