package 단어공부;

import java.util.Scanner;

//알파벳 대소문자로 이루어진 단어가 주어지면 가장 많이 등장한 알파벳을 찾는 문제
//입력은 대문자를 입력하고 결과는 대소문자 구분하지않음 (AaAbcdd =>A)
//만약 가장 많이 등장하는 알파벳이 여러개인 경우는 ? 로 출력
//ddcfgrG => ?
//대문자로 출력
public class WordStudy {
    public static void main(String[] args) {

        int[] alphabet = new int[26]; //알파벳 개수만큼의 배열 생성(가장 많이 등장하는 알파벳을 count하기위해)
        int max = 0; // 제일 큰수 찾기
        char result = 0; //결과 값으로 출력할 알파벳을 구하기 위한 변수
        Scanner sc = new Scanner(System.in);
        System.out.print("단어입력 : ");
        String word = sc.next();
        for(int i = 0; i < word.length(); i++){ //입력 받은 단어의 길이 만큼 순회하면서 알파벳 배열의 횟수 누적
            if(word.charAt(i) >='a') alphabet[word.charAt(i) - 'a']++;
            else alphabet[word.charAt(i)-'A']++;
        }

        for(int i = 0; i<alphabet.length; i++){
            if(alphabet[i] == max) result = '?'; // 배열 인덱스의 값과  max 값이 같으면 '?'
            else if(alphabet[i] > max) {
                max = alphabet[i];//인덱스의 해당 하는 배열 값이 더 크면 max값 변경
                result = (char)('A'+i); // 배열 인덱스에서 'A' 만큼의 값을 증가 시켜서 실제 대문자 ASCII 값을 구함

            }
        }
        System.out.println(result);

    }
}
