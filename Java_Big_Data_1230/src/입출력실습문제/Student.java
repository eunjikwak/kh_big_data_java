package 입출력실습문제;


public class Student implements Comparable<Student> {
    private String name;
    private int score1;
    private int score2;
    private int score3;
    private int sum;

    public Student(String name, int score1, int score2, int score3) {
        this.name = name;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.sum = (score1+score2+score3);
    }

    public String getName() {
        return name;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public int compareTo(Student o) {
        if(this.sum == o.sum){
            return this.name.compareTo(o.name);
        }
        return o.sum-this.sum;
    }

}
