package 제네릭응용;

public class Powder extends Material{
    public void doPrinting(){
        System.out.println("Powder 재료로 출력합니다.");
    }
    @Override //오브젝트로 오버라이딩 된거임.
    public String toString(){
        return "재료는 Powder 입니다.";
    }
}
