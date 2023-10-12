package chap07.Sec01.exam01;

/**
 * packageName : chap07.Sec01.exam01
 * fileName : StudentApplication
 * author : GGG
 * date : 2023-09-21
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-21         GGG          최초 생성
 */
public class StudentApplication {
    public static void main(String[] args) {
        Student student = new Student("홍길동", "123456-13345679", 1);
        System.out.println("name: " + student.name);
        System.out.println("ssn: " + student.ssn);
        System.out.println("studentNo: " + student.studentNo);
    }
}
