package 상속실습예제;
// 인간(Person) 이라는 클래스 생성
// - age : 나이 특성을 가짐 (정수 값 사용,게터,세터 만들기) -몇살?
// - sleep : 잠자는 특성 (정수값 사용, 게터 세터 ) -몇시간 잠자는지

//인간인으로 부터 직장인 생성
// - work : 몇시간 일하는지 ? (정수, 게터 세터)
// 인간으로 부터 학생을 생성
// - study : 공부하는 특성 (1 입력 "열심히", 2 "적당히 " , 3"놀면서")
public class InheritanceEx1 {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.setAge(30);
        worker.setSleep(5);
        worker.setWorkTime(8);
        worker.inFoWorker();


        Student student = new Student(18,10,1);
        student.inFoStudy();
        student.setStudy(2);
        student.inFoStudy();

    }
}
