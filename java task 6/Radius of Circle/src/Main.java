public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("____Radius of Circle____");
        System.out.println();

        class Circle {
            int radius = 5;
            double pi = 3.14;

            Circle(int r, double pi) {
                this.radius = r;
                this.pi = pi;
            }

            Circle() {

            }

            public void getRadius() {
                System.out.println(this.radius);
                System.out.println();
            }

            public void getPi() {
                System.out.println(this.pi);
                System.out.println();
            }

            public void getCircumference() {
                System.out.format("%2f", 2*this.pi*this.radius);
                System.out.println();
            }

            public void Circumference() {

                System.out.println(" Radius : " + this.radius);
                System.out.print(" Pi Value : ");
                System.out.format("%2f" ,pi);
                System.out.println();
                System.out.print(" Circumference of Circle = " );
                System.out.format("%2f" , 2*this.pi*this.radius);
                System.out.println();
            }
        }

        Circle C1 = new Circle(10, 3.14);

        Circle C2 = new Circle();

        C1.getRadius();
        C1.getPi();
        C1.getCircumference();
        System.out.println();
        C1.Circumference();

        System.out.println();

        C2.getRadius();
        C2.getPi();
        C2.getCircumference();
        System.out.println();
        C2.Circumference();
}}