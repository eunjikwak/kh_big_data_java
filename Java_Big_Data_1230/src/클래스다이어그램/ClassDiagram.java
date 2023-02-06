package 클래스다이어그램;
//클래스 다이어그램 (Circle)
// + PI : double = 3.14 => public static final PI = 3.14;
// - radius : double  => private double radius;
// + Circle(radius : double) =>public Circle(double radius)
public class ClassDiagram {
    public static void main(String[] args) {

        Circle circle = new Circle(20.0); //객체 생성시 생성자의 매개변수를 넣어야함.
        circle.setRadius(3.1);
        circle.draw();

    }
}
