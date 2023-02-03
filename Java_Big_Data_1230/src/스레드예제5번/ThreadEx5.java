package 스레드예제5번;
// 스레드간 협업 : wait(), notify(), notifyAll()
// 1.wait() : 현재의 스레드를 일시정지상태로  전환시킴
// 2.notify() : 대기 상태에 있는 스레드를 실행대기 상태로 전환시킴
// 3.notifyAll() : 일시 정지된 모든 스레드를 실행 대기로 만듬
public class ThreadEx5 {
    public static void main(String[] args) {

        WorkObject sharedObject = new WorkObject();
        ThreadA thA = new ThreadA(sharedObject);
        ThreadB thB = new ThreadB(sharedObject);
        thA.start();
        thB.start();
    }
}
