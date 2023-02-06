package 클래스다이어그램;

public class Circle {
        public final static  double PI = 3.14;
        private double radius; //접근제한자 확인 필요 ( -는 private를 의미)
        public Circle (double radius){ //생성자 호출 시 매개변수가 필요함
            this.radius = radius;
        }
        public double getRadius(){
            return radius;
        }

        public void setRadius(double radius){
            this.radius = radius;
        }

        public static  double getPi() {
            return PI;
        }
        public void draw(){
            System.out.println("반지름 : " + radius + "cm인 원을 그립니다.");
        }

    }

