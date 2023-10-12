package chap06.Sec05.exam05;

/**
 * packageName : chap06.Sec05.exam05
 * fileName : PersonApplication
 * author : GGG
 * date : 2023-09-21
 * description : 실행클래스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-21         GGG          최초 생성
 */
public class PersonApplication {
    public static void main(String[] args) {
        Person person = new Person("123456-1234567", "홍길동");
//        상수 출력
        System.out.println(person.nation); // 상수
        System.out.println(person.ssn);    // 상수
        System.out.println(person.name);   // 변수

        person.name = "강감찬";
//        person.nation = "CANADA"; // 상수이므로 변경 불가
//        person.ssn = "1346584-1346343";
    }
}
