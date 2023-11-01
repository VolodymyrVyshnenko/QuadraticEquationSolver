public class QuadraticEquationResult {
    private double root1;
    private double root2;

    public QuadraticEquationResult(double root1, double root2) {
        this.root1 = root1;
        this.root2 = root2;
    }

    public QuadraticEquationResult(double root) {
        this.root1 = root;
    }

    public QuadraticEquationResult() {
        // No real roots
    }

    public double getRoot1() {
        return root1;
    }

    public double getRoot2() {
        return root2;
    }
}
