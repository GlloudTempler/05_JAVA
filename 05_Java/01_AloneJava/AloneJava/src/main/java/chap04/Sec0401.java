package chap04;

import java.util.Random;

/**
 * packageName : chap04
 * fileName : Sec0401
 * author : GGG
 * date : 2023-09-19
 * description : 조건문
 * 요약 :
 *         if문 - if(조건문){실행문1} else if(조건문2){실행문2} else{실행문3}
 *         => 조건문1 true 실행문1 실행되고 조건문2 true 실행문2 가 실행되고 모두 아니면 실행문3
 *         switch문 - switch(변수){case 값1 : 실행문1;break; case 값2: 실행문2;break;
 *                                 default: 실행문3;break;}
 *
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-19         GGG          최초 생성
 */
public class Sec0401 {
    /*
    * 예제1 : 초기값이 90이상이면 점수가 90보다 큽니다. 등급은 A입니다.
    *        출력 90이하면 점수가 90보다 작다., 등급은 B입니다 출력
    * */
    public void exam01() {
        int score = 93; // 초기값
        int AScore = 90;
        if(score > AScore) {
            System.out.println("점수가 "+ AScore + "보다 큽니다. 등급은 A입니다.");
        }else{
            System.out.println("점수가 "+ AScore + "보다 작습니다. 등급은 B입니다.");
        }
    }
    /*
    * 자바 랜덤 함수 소개하는 예제
    * 랜덤 함수 : Math.random() : 0~1까지 숫자를 내보내기
    * 1 ~ 10까지 정수 뽑기
    * 가공 :
    *       1 <= x < 11의 정수 뽑기로 변환
    *       1) 0.0 <= Math.random() < 1.0
    *       2) (int)(0.0 * 10 <= Math.random()*10 < 1.0 * 10)
    * */
    public void exam02() {
        // 예제 : 주사위를 던져서 나오는 숫자를 화면에 출력
        // 단, 1~6까지 랜덤으로 나옴
        int num = (int)(Math.random()*6 +1);
        if(num==1) {
            System.out.println("1번");
        }else if(num==2) {
            System.out.println("2번");
        }else if(num==3) {
            System.out.println("3번");
        }else if(num==4) {
            System.out.println("4번");
        }else if(num==5) {
            System.out.println("5번");
        }else{
            System.out.println("6번");
        }
    }

    /*
    * switch문을 이용해서 코딩
    * 부장이면 700만원, 과장이면 500만원 출력, 그 외에는 300만원 출력
    * */
    public void exam08() {
        String position = "과장"; // 초기값
        switch (position) {
            case "부장" : System.out.println("700만원");
            break;
            case "과장" : System.out.println("500만원");
            break;
            default : System.out.println("300만원");
            break;
        }

    }
}