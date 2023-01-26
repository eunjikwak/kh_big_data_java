package 열거타입예제;

public class EnumTypeEx2 {
    public static void main(String[] args) {
        Developer developer = new Developer("가나다", DevType.EMBEDDED, Career.JUNIOR,Gender.FEMALE);
        developer.devInfo();

        Developer developer1 = new Developer("가나다", DevType.DBA, Career.SENIOR,Gender.MALE);
        developer.devInfo();

    }
}
