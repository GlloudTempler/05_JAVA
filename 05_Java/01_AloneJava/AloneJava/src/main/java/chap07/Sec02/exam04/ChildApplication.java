package chap07.Sec02.exam04;

/**
 * packageName : chap07.Sec02.exam04
 * fileName : ChildApplication
 * author : GGG
 * date : 2023-09-22
 * description : 실행클래스, instanceOf 연산자
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-22         GGG          최초 생성
 */
public class ChildApplication {
//    정적(공유, 전역) 함수
    public static void method1(Parent parent) {
//        TODO : 사용법 : 부모객체 instanceOf 자식클래스
//               목적 : 객체가 자식클래스인지 확인하는 용도
        if(parent instanceof Child) {
//            강제 형변환 실시 : 자식 객체 원복 (큰것 -> 작은것 : 수동)
            Child child = (Child)parent;
            System.out.println("강제형변환 성공");
        }else {
            System.out.println("강제형변환 실패");
        }
    }
    public static void main(String[] args) {
        Parent parent = new Child();
        method1(parent);
    }
}
