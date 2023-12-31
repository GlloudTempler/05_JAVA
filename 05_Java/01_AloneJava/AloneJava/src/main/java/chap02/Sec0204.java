package chap02;

import java.util.Scanner;

/**
 * packageName : chap02
 * fileName : Sec0204
 * author : GGG
 * date : 2023-09-18
 * description :
 * 요약 :
 *          System.out.println() : 화면에 출력하고 줄바꿈 함수
 *          System.out.print() : 화면에 출력하는 함수
 *          System.out.printf("%d %s %f", 정수변수, 문자열변수, 실수변수)
 *          Scanner : 콘솔 입력을 받기 위한 클래스(객체 정의)
 *                    한라인 입력 받기 함수 : .nextLine();
 *                    공백까지 입력 받기 함수 : .next();
 *                    참고) nexInt(), nexDouble() 등
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-18         GGG          최초 생성
 */
public class Sec0204 {
    public void exam05() {
        Scanner scanner = new Scanner(System.in);
        String inputData; // 입력 문자열

        while (true) {
            inputData = scanner.nextLine(); // 1라인 입력받기
            System.out.println("입력된 문자열 : " + inputData);
//            TODO 코드를 완성하시오 (입력된 문자열이 q가 들어오면 반복문 종료)
//            TODO 문자열.equals("문자열2") : 같으면 true, 아니면 false
            if(inputData.equals("q")) {
                break;
            }
        }
    }

}
