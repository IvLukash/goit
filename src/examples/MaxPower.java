package examples;

import java.util.Scanner;

class MaxPower {
    public void calculateMaxPower() {
        Scanner scanner = new Scanner(System.in);
        int power1 = scanner.nextInt();
        int power2 = scanner.nextInt();
        int power3 = scanner.nextInt();
        int maxPower;
        float flightMode;

        maxPower = power1;
        if(maxPower < power2) {
            maxPower = power2;
        }
        if(maxPower < power3) {
            maxPower = power3;
        }

        if(maxPower < 10) {
            flightMode = maxPower * 0.7f;
        } else if(maxPower <= 100) {
            flightMode = maxPower * 1.2f;
        } else {
            flightMode = maxPower * 2.1f;
        }
        System.out.println(flightMode);
        scanner.close();
    }
}
