package chap01;

/**
 * packageName : chap01
 * fileName : Sec0101
 * author : GGG
 * date : 2023-09-18
 * description : 업무로직 클래스
 * 요약 :
 *          환경 설정 : JavaApplication (main 함수가 있는 클래스 : 실행 클래스)
 *                    클래스(객체 정의) : 변수/함수가 있는 파일(업무 로직이 들어 있는 클래스)
 *                툴 : 1) 파일 인코딩(UTF-8)
 *                     2) Help - 사용자 지정 vm옵션
 *                        - Dfile.encoding=UTF-8
 *                        - Dconsole.encoding=UTF-8
 *                     3) 설정 - 플러그인 - 마켓플레이스
 *                        - Atom~
 *                        - Korean~
 *                        - Rainbow~
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-18         GGG          최초 생성
 */
public class Sec0101 {
    /*
    * Hello World 출력 함수
    * */
    public void exam01() {
        System.out.println("HelloWorld");

    }
    public void exam02() {
//        예제 1) x, y 정수 변수를 만들어서 덧셈결과 출력
        int x = 1;
        int y = 2;
        int result = x+y;
        System.out.println(result);
    }

}

