package 클래스정렬연습답;

import java.util.Comparator;

public class ScoreSort implements Comparator<StudentInfo> {
    @Override
    public int compare(StudentInfo o1, StudentInfo o2) {
        if(o1.score == o2.score){
            return o1.number.compareTo(o2.number);
        }
        return o2.score - o1.score; // 성적이 높은 사람 순으로 내림차순 (큰거에서 작은것 순으로..)
    }
}
