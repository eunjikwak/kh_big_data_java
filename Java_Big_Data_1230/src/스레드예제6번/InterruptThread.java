package 스레드예제6번;

public class InterruptThread extends Thread{
    @Override
    public void run(){
        try{
            while(true){
                System.out.println("쓰레드 실행중 ...");
                sleep(1); //유일한 탈출 조건
            }
        }catch (InterruptedException e){
            System.out.println("인터럽트 발생.....");
        }
        System.out.println("종료를 위해 자원 지원중...");
        System.out.println("실행종료");
    }
}
