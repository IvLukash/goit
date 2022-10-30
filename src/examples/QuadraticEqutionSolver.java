package examples;

import java.util.Arrays;

class QuadraticEquationSolver {
    public double[] solve(int a, int b, int c) {
        double discriminant = b * b - 4 * a * c;
        if(discriminant > 0) {
            return new double[] {
                    (-b + Math.sqrt(discriminant)) / (2 * a),
                    (-b - Math.sqrt(discriminant)) / (2 * a)
            };
        } else if(discriminant == 0) {
            return new double[] {
                    -b / (2.0 * a)
            };
        } else {
            return new double[] {};
        }
    }

    public static void main(String[] args) {
        QuadraticEquationSolver quadraticEquationSolver = new QuadraticEquationSolver();
        System.out.println(Arrays.toString(quadraticEquationSolver.solve(10,-70,0)));
    }
}
