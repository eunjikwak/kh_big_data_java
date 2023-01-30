package 제네릭응용;

public class GenericPrinter<T extends Material> { // Material 로 부터 상속 받은 클래스만 타입변수로 지정가능 하도록 함.

    private T material; //재료가되는 물질을 변수로 받음


    public void setMaterial(T material){
        this.material = material;
    }
    public T getMaterial(){
        return material;
    }
    @Override
    public String toString(){
        return material.toString();
    }
}
