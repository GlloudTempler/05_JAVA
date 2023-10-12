package chap03;

import java.util.Scanner;

/**
 * packageName : chap03
 * fileName : Sec0301
 * author : GGG
 * date : 2023-09-18
 * description : 연산자
 * 요약 :
 *       산술 : +, -, *, /, %(나머지 연산자)
 *       부호 : +, -
 *       문자열 붙이기 : +
 *       대입 : =, +=, -+. *=, /=, %=
 *       증감 : ++,--
 *       비교 : ==, !=, >, <, >=, <=, (1문자 비교, 숫자비교) instanceof
 *       문자열비교 : 문자열.equal(문자열2)
 *       논리 : !, &, |(비트연산자), &&(논리곱), ||(논리합)
 *       삼항 : (조건식)? A:B
 *       우선순위가 필요하면 () 쓸것
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-18         GGG          최초 생성
 */
public class Sec0301 {
    public void exam01() {
        int x = -100;
        int result1 = +x; // 부호 연산자 이용
        int result2 = -x;
        System.out.println(result1);
        System.out.println(result2);
    }
    public void exam03() {
        boolean play = true;
        System.out.println(play);
        play = !play; // 반대값(!)
        System.out.println(play);
    }
    /*
    * 사칙연산 예제 / 나눗셈 조심
    */
    public void exam04() {
        int v1 = 5;
        int v2 = 2;

        int result1 = v1 + v2;
        System.out.println(result1);

//        나눗셈
        int result2 = v1 / v2;
        System.out.println(result2); // 실수부분이 잘림

//        TODO 나눗셈 개선 코딩 : 강제 형변환 후 계산
        double result3 = (double)v1 / (double)v2;
//        double result3 = (double)v1 / v2; 같은 결과
        System.out.println(result3);

    }
//    연습문제 : 자연수 입력받아 그대로 출력하기
//    입력 5
    public void exam05() {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        System.out.println(inputNumber);
    }
//    입력 a b
//    출력 b a
    public void exam06() {
        Scanner scanner = new Scanner(System.in);
        String inputstr1 = scanner.next(); // (공백까지 입력받기)
        String inputstr2 = scanner.next();

        System.out.println(inputstr2 + " " + inputstr1);
    }
//
    public  void exam07() {
        char c1 ='A' + 1; // char(정수_ : 'B' ('A' 아스키코드(5^) 65+! = 66)
        char c2 = 'A';
        System.out.println(c1);
        System.out.println(c2);
    }


//  연습문제3)
//   값이 'A'로 주어져 있다, 'A' 대문자면 대문자, 소문자면 소문자, 숫자이면 숫자라고 출력
    public void exam09() {
        int charCode = 'A';
//        TODO 아래코드를 완성
        if(charCode >= 65 && charCode <= 90) {
            System.out.println("대문자");
        }else if(charCode >= 97 && charCode <= 122) {
            System.out.println("소문자");
        }else if(charCode >= 48 && charCode <= 57){
            System.out.println("숫자");
        }else {
            System.out.println("다른 문자");
        }
    }

    /*
    * 연습문제 : 정수 1개가 주어진다. 2와 3의 배수이면 2또는 3의 배수이다,
    *           아니면 2 또는 3의 배수가 아니다.
    */

    public void exam10() {
        int value = 6;
//        TODO 아래 코딩완성
        if(value % 2 == 0 || value % 3 == 0) {
            System.out.println("2 또는 3의 배수이다.");
        }else {
            System.out.println("2 또는 3의 배수가 아니다.");
        }
    }

}