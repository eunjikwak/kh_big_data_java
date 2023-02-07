package 소수단어;

import java.util.Scanner;

public class TEST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int num = 0;
        for(int i = 0 ; i < word.length(); i++) {
            if(word.charAt(i) >='a'){
                num+=word.charAt(i)-'a'+1;
            }else {
                num+=word.charAt(i)-'A'+ 27;
            }
        }
        if(isPrime(num)){
            System.out.println("It is a prime word.");
        }else {
            System.out.println("It is not a prime word.");
        }
    }

    static boolean isPrime(int num){
        for(int i = 2; i < num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}
