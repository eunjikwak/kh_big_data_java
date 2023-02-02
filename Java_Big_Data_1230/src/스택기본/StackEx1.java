package 스택기본;

import java.util.Stack;

//Stack : LIFO(Last in Fist Out) 구조, Vector 의 기능을 제약해서 만듬, 메모리구조의 Stack 영역이 대표적인 예시
// 입력과 출력이 한곳에서만 일어남(단방향 구조)
// push() : 객체 삽입
// peek() : 스택의 맨위에 값 확인
// pop() : 맨위에 값 추출 하면서 보여 줌
// empty() : 스택이 비어있는지 반환 (true/false)
// size() : 스택에 포함된 개개체의 개수 반환
// contains(값) : 해당 값이 스택에 포함되어 있는지 확인
public class StackEx1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek()); //3
        System.out.println(stack.pop()); //3
        System.out.println(stack.empty()); //false
        System.out.println(stack.size()); // 2
        System.out.println(stack.contains(1));//true
        //스택의 모든 값을 보고싶으면 stack 쓰지말고 Arraylist 사용 하는게 맞음
        for(Integer e : stack) System.out.print(e +" ");


    }
}
