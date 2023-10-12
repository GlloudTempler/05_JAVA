package chap06.Sec04.Verify.exam04;

/**
 * packageName : chap06.Sec04.Verify.exam04
 * fileName : Printer
 * author : GGG
 * date : 2023-09-20
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-20         GGG          최초 생성
 */
public class Printer {
//    속성, 생성자함수 생략
//    함수 : 오버로딩 기능

    static void println(int number) {
        System.out.println("공유함수(int) : " + number);
    }
    static void println(boolean bol) {
        System.out.println("공유함수(boolean) : " + bol);
    }
    static void println(double dob) {
        System.out.println("공유함수(double) : " + dob);
    }
    static void println(String name) {
        System.out.println("공유함수(int) : " + name);
    }


}
