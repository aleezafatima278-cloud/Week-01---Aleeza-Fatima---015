public class Calculator {
    
    private double first;
    private double second;

    public Calculator() {
        this.first = 0;
        this.second = 0;
    }

    public Calculator(double first, double second) {
        this.first = first;
        this.second = second;
    }

    public void setNumbers(double first, double second) {
        this.first = first;
        this.second = second;
    }

    public double add(double first, double second) {
        return first + second;
    }

    public double subtract(double first, double second) {
        return first - second;
    }

    public double multiply(double first, double second) {
        return first * second;
    }

    public double divide(double first, double second) {
        if(second != 0) {
            double s = first/second;
            return s;
        } else {
            System.out.println("invalid division");
            return -1;
        }
    }

    public double average(double first, double second, int count) {
        this.first = first;
        this.second = second;
        double total = this.first + this.second;
        if(count != 0) {
            return total/count;
        } else {
            System.out.println("cannot calculate");
            return -1;
        }    
    }

    public double power(double num, int powernum) {
        double j = num;
        if(powernum == 0) {
            return 1;
        }
        if(powernum >= 0) {
            for(int i =1; i<powernum;i++) {
                num = num * j;
            }
            return num;
        } else {
            for(int k =0; k<-powernum;k++) {
                 num = num * j;
            }
            return 1/num;
            
            }
        }
    

    public int modulus(int number, int modulusnumber) {
        if(modulusnumber == 0) {
            System.out.println("cannot calculate");
            return -1;
        } else {
            return number % modulusnumber;
        }
    }
}
