package Chap11.Sec01.exam04;

/**
 * packageName : Chap11.Sec01.exam04
 * fileName : ExitApplication
 * author : GGG
 * date : 2023-09-26
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-26         GGG          최초 생성
 */
public class ExitApplication {
    public static void main(String[] args) {
//        TODO : 0~10수중에 값이 5일 때 프로그램 강제 종료
        for (int i = 0; i < 10; i++) {
            if(i == 5) {
                // break : 반복문 종료
                System.exit(i); // 프로그램 강제 종료(kill)
            }
        }
        System.out.println("코드 실행?"); // x
    }
}
