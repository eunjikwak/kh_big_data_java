package 클래스정렬예제1;

public class CarSort implements Comparable<CarSort>{
    String modelName;
    int modelYear;
    String color;

    public CarSort(String modelName, int modelYear, String color) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
    }

    @Override
    public int compareTo(CarSort o) {
        if(this.modelYear == o.modelYear){
            //앞의 문자열이 사전순으로 뒤에있으면 양수값 반환
            return this.modelName.compareTo(o.modelName);//문자열 비교 뒤에가 짧으면 양수여서 뒤집힘 (아스키코드로 비교함) 정렬에 대한 조건만 넣고 퀵소트가 알아서 정렬해줌
        }
        return this.modelYear-o.modelYear; // 앞이 뒤보다 크면 정렬(오름차순)
    }
}
