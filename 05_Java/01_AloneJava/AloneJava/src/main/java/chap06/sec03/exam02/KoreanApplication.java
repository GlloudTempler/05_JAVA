package chap06.sec03.exam02;

/**
 * packageName : chap06.sec03.exam02
 * fileName : KoreanApplication
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
public class KoreanApplication {
    /**
     * 한국인 객체를 생성하고 매개변수 2개짜리 생성자를 이용해서 속성을 초기화하세요.
     * 초기화 한 결과를 출력하세요.
     * //        결과 :
     * //            k1.name : 박자바 (문자열)
     * //            k1.ssn : 011225-1234567 (문자열)
     * //            k2.name : 김자바
     * //            k2.ssn : 930525-0654321
     */
    public static void main(String[] args) {
        Korean k1 = new Korean("박자바", "011225-1234567");
        Korean k2 = new Korean("김자바", "930525-0654321");

        System.out.println(k1.name);
        System.out.println(k1.ssn);

        System.out.println(k2.name);
        System.out.println(k2.ssn);
    }
}
