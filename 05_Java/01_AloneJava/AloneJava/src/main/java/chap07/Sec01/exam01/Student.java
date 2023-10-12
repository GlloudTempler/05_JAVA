package chap07.Sec01.exam01;

/**
 * packageName : chap07.Sec01.exam01
 * fileName : Student
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
public class Student extends People {
    public int studentNo; // 학번
//    생성자 studentNo + 부모 속성까지

    public Student(String name, String ssn, int studentNo) {
        super(name, ssn); // TODO: 부모의 매개변수 있는 생성자를 호출함
        this.studentNo = studentNo;
    }
}
