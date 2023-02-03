package 스레드예제2번;
// 스레드를 생성하는 방법 :
// 1.상속을 받는 방법 (extends Thread) : 구현이 간편하지만 다른 상속을 받지 못함.
// 2. Runnable 인터페이스로 구현 : 다른 클래스의 상속을 받을 수 있음, 스레드 객체를 만드는 과정이 필요함
// 3. 익명의 객체로 구현 : 클래스 생성이 없이 간편하게 구현 할 수 있음.
// 4. 익명의 객체를 람다식으로 구현
public class ThreadEx2 {
    public static void main(String[] args) {
        Thread clsTh1 = new CustomThread();
        clsTh1.start(); // 내부적으로 run()메소드 호출 ( 호출대기하는거임 - 호출을 직접하는게 아니라 운영체제가 해줌)
        Runnable run = new RunThread(); // 수행해야할 작업내용은 포함하고 있지만 실제 스레드는 아님.
        Thread runTh1 = new Thread(run);
        Thread runTh2 = new Thread(run);
        runTh1.start();
        runTh2.start();
        //익명의 객체 생성
        Runnable task = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for(int i = 0; i < 10 ; i++){
                    sum +=i;
                    System.out.println(""+Thread.currentThread() + sum);// 서로 반환값이 달라서 문자열로 인식하라는 의미로 앞에 ""써줌
                }
                System.out.println(Thread.currentThread() + "합계 : " + sum);
            }
        };
        Thread runTh3 = new Thread(task);
        runTh3.start();
        //익명의 객체를 람다식으로 생성
        Runnable task2 = () -> {
            int sum = 0;
            for(int i = 0; i < 10 ; i++){
                sum +=i;
                System.out.println(""+Thread.currentThread() + sum);
            }
            System.out.println(Thread.currentThread() + "합계 : " + sum);
        };
        Thread runTh4 = new Thread(task2);
        runTh4.start();

        System.out.println("나는 메인입니다.");
        System.out.println("나는 메인입니다.");
        System.out.println("나는 메인입니다.");
    }

}
