package pl.lublin.wsei.java.cwiczenia;

public class Main {
    public static void main(String[] args) {

        double potega = 1;
        double suma = 0;
        System.out.println("arg\tlog(arg)\tsum(arg)");
        for (int i = 1; i <= 11; i++) {
            suma += potega;
            double log = (Math.log(potega) / Math.log(2));
            System.out.printf("%.0f\t\t%.0f\t\t%.0f\n", potega, log, suma);
            potega = Math.pow(2, i);
        }

    }
}

