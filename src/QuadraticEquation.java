public class QuadraticEquation {
    double a, b, c, delta;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.delta = (Math.pow(b, 2) - 4 * a * c);
    }

    public double getterA() {
        return a;
    }

    public double getterB() {
        return b;
    }

    public double getterC() {
        return c;
    }

    public double getDiscriminant() {
        return delta;
    }

    public double getRoot1() {
        if (delta >= 0) {
            return ((-b + Math.pow(delta, 0.5)) / 2 * a);
        }else return 0;

    }

    public double getRoot2() {
        if (delta >= 0) {
            return ((-b - Math.pow(delta, 0.5)) / 2 * a);
        }else return 0;

    }
}
