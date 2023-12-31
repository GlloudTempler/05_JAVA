package Chap12.Sec01.exam08;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName : Chap12.Sec01.exam08
 * fileName : ArrayListApplication
 * author : GGG
 * date : 2023-09-25
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-25         GGG          최초 생성
 */
public class ArrayListApplication {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

//        TODO 객체 자료 추가
        students.add(new Student(1, "홍길동"));
        students.add(new Student(2, "장길산"));
        students.add(new Student(3, "임꺾정"));
        System.out.println(students);

//        TODO 객체 자료 수정 : 0번 인덱스번호의 값 : 홍길동 -> 홍길동2로 수정
        students.set(0, new Student(1, "홍길롱2"));
        System.out.println(students.get(0));

//        TODO 객체 자료 삭제
        students.remove(0);
    }
}
