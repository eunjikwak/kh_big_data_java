package 입출력실습문제;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.*;
public class InOutStreamTest1 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>();
        InputStream is = null;
        try {
            is = new FileInputStream("Java_Big_Data_1230/text.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner sc = new Scanner(is);
        while (sc.hasNextLine()) { //읽어드릴 라인이 있으면 true
                String line = sc.nextLine();
                String[] str = line.split(" ");
                ts.add( new Student(str[0],
                        Integer.parseInt(str[1]),
                        Integer.parseInt(str[2]),
                        Integer.parseInt(str[3])));
        }
        for(Student e : ts) System.out.println(e.getName() +" : " + e.getSum());

    }

}