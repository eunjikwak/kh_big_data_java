package 스레드예제6번;

import static java.lang.Thread.sleep;

// 스레드의 안전한 종료방법은 stop 플래그를 구현하는 방법과 interrupt() 메소드를 사용하는 방법이있다.
public class ThreadEx6 {
    public static void main(String[] args) throws InterruptedException {
//        RunThread runThread = new RunThread();
//        runThread.start();
//        sleep(10000);
//        runThread.setStop(true);
        InterruptThread interruptThread = new InterruptThread();
        interruptThread.start();
        sleep(10000);
        interruptThread.interrupt(); // 일시 정지 상태에 쓰레드에 Interrupt Exception 발생시킴
    }
}
