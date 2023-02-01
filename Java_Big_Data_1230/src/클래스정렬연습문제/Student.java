package 클래스정렬연습문제;

public class Student implements Comparable<Student>{
    String name;
    int score;
    String id;


    public Student(String name, int score, String id) {
        this.name = name;
        this.score = score;
        this.id = id;

    }



    @Override
    public int compareTo(Student o) {
       if(this.score == o.score){
           return this.id.compareTo(o.id);
       }
       return o.score - this.score;
    }
}
