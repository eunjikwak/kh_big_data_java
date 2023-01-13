package 상속실습예제;

public class Person {
    int age;
    int sleep;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getSleep() {
        return sleep;
    }
    public void setSleep(int sleep) {
        this.sleep = sleep;
    }
}
class Worker extends Person{
    int workTime;

    void setWorkTime(int workTime){
        this.workTime= workTime;
    }
    int getWorkTime(){
        return workTime;
    }

    void inFoWorker(){
        System.out.println("나이 : " + getAge());
        System.out.println("잠자는 시간 : " + getSleep() + "시간");
        System.out.println("일하는 시간 : " + getWorkTime() +"시간");
        System.out.println("------------------------");
    }
}

class Student extends Person{
    int study;

    Student(int age,int sleep,int study){
        this.age= age;
        this.sleep = sleep;
        this.study = study;
    }
    void setStudy(int study){
        this.study= study;
    }
    String getStudy(){
        String[] studyStr = {"","\"열심히\"","\"적당히\"","\"놀면서\""};
        return studyStr[study];
    }

    void inFoStudy(){

        System.out.println("나이 : " + age);
        System.out.println("잠자는 시간 : " + sleep + "시간");
        System.out.println("공부를 " + getStudy() +" 합니다.");
        System.out.println("------------------------");
    }
}
