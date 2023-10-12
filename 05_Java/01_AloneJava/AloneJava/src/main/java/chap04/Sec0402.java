package chap04;

/**
 * packageName : chap04
 * fileName : Sec0402
 * author : GGG
 * date : 2023-09-19
 * description : 반복문
 * 요약 :
 *      for 문 : for(초기화식; 조건식; 증감식) {반복문;}
 *      => 조건식이 true일때반 반복문 실행
 *      while문 : 초기화식;
 *              while(조건식) {
 *                  반복문;
 *                  증감식;
 *              }
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-19         GGG          최초 생성
 */
public class Sec0402 {
    /*
    * 예제 1) 1 ~ 10까지 숫자를 화면에 출력
    * */
    public void exam01() {
        String result = "";
        int i;
        for(i = 1; i <= 10; i++) {
            result += i + " ";
        }
        System.out.println(result);
    }

    /*
    * 예제 2) 1~100까지의 합을 출력
    * */
    public void exam02() {
        int result = 0;
        int i;
        for(i = 1; i <= 100; i++) {
            result += i;
        }
        System.out.println(result);
    }

    /*
    * 예제 : 주사위를 던져서 나오는 숫자를 계속 화면에 출력하되 6이 나오면 반복문 중단
    * */

    public void exam08() {
        while(true) {
            int i = (int)(Math.random()*6 +1);
            System.out.println(i);
            if(i == 6) {
                System.out.println("프로그램 종료");
                break;
            }
        }
    }

    /*
    * 에제 9) 1 ~ 10 사이의 수에서 짝수만 출력하는 코드 : continue 문 사용
    * continue : 아래 실행을 skip하고 반복문 계속 진행시키기
    * */
    public void exam09() {
        int i;
        String result = "";
        for(i = 1; i<=10; i++) {
            if(i % 2 == 0) {
                result += i + " ";
                continue;
            }
        }
        System.out.println(result);
    }
    /*
    * 새로나온 사용법 : 반복문의 라벨
    * 활용 : 중첩 for문에서 주로 사용
    * */
    public void exam10() {
        Outter:
        for (char upper = 'A'; upper <= 'Z'; upper++) {
            for (char lower = 'a'; lower <= 'z'; lower++) {
                System.out.println(upper + "-" + lower); // 화면 출력
//                g 가 나오면 (안쪽/바깥쪽 모두) 반복문 중단
                if(lower == 'g') {
                    break Outter; // 2중 반복문이 모두 중단됨
                }
            }
        }
        System.out.println("프로그램 종료");
    }
}
