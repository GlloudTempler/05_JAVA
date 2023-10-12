package chap03;

import java.util.Scanner;

/**
 * packageName : chap03
 * fileName : Verify03
 * author : GGG
 * date : 2023-09-18
 * description : 연습문제 자바 파일
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-18         GGG          최초 생성
 */
public class Verify03 {
//    속성(멤버 변수)
//    생성자 함수
//    함수(멤버 메서드)
    /*
    * 두 실수를 입력받아서 나숫셈을 결과로 출력하세요
    * 단, 두번째 수가 0일 경우 "무한대"로 출력
    * 입력 : 9
    *       3
    * 출력 : 3.0
    *  */
    public void exam01() {
        Scanner scanner = new Scanner(System.in);
        int inputValue1 = scanner.nextInt();
        int inputValue2 = scanner.nextInt();
        double result = (double)inputValue1 / inputValue2;
        if(inputValue2 == 0 ) {
            System.out.println("무한대");
        }else {
            System.out.println(result);
        }
    }

    /*
    * 원의 넓이를 구하시요. (반지름*반지름*3.14)
    * */
    public void exam02() {
        int var1 = 10;
        double result = var1*var1*3.14;
        System.out.println(result);
    }

/**
 * 문제 : 1) 아이디와 패스워드를 각각 입력받아 아이디가 "java"가 아니면
 *   "로그인 실패:아이디가 존재하지 않음"을 출력하세요.
 *   2) 아이디가 "java" 이면, 패스워드를 체크해서 패스워드가 12345이면 "로그인 성공" 출력하고,
 *   패스워드가 12345가 아니면 "로그인 실패:패스워드가 틀림"을 출력하세요.
 *   힌트 : 중첩 if문 쓰기
*/
    public void exam03() {


        String userid = "java";
        String userpw = "12345";
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String id = scanner.next();
            if(userid.equals(id)) {
                String password = scanner.next();
                if(userpw.equals(password)) {
                    System.out.println("로그인 성공");
                    break;
                }else{
                    System.out.println("로그인 실패 : 패스워드 틀림");
                }
            }else{
                System.out.println("로그인 실패 : 아이디가 존재하지 않음");
            }
        }

    }
}
