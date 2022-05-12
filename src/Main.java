public class Main {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation(1,4,2);
        System.out.println(quadraticEquation.getDiscriminant());
        System.out.println(quadraticEquation.getRoot1());
        System.out.println(quadraticEquation.getRoot2());
    }

}
