package examples;

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
                    -b / 2.0 * a
            };
        } else {
            return new double[] {};
        }
    }
}
