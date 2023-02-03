package 스레드예제4번;

import java.util.TreeSet;

// join() : 다른 스레드가 종료 될 때 까지 기다렸다가 실행해야하는 경우에 사용
public class ThreadEx4 {
    public static void main(String[] args) {
        SumTh sumTh = new SumTh();
        sumTh.start();
        try{
            sumTh.join(100); // sumTh 가 종료 될 때까지 main 이 대기하고 있음.
            //수행이 끝날때까지 기다려준것 그래서 답 100이 나옴
            //안에 millis 넣어주면 그시간동안 대기 걸어줌
        }catch (InterruptedException e){
        }


        //답은 0 이유는 계산할 시간도없이 바로 내려옴
        System.out.println("합 : " + sumTh.getSum());

    }
}

class  SumTh extends Thread{
    private long sum;

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }
    @Override
    public void run(){
        for(int i = 0; i <100 ; i++){
            sum +=1;
            try {
                sleep(1);
            } catch (InterruptedException e) {
            }
        }
    }
}
