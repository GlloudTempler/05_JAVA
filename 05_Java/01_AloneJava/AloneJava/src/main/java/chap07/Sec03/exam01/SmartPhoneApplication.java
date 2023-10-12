package chap07.Sec03.exam01;

/**
 * packageName : chap07.Sec03.exam01
 * fileName : SmartPhoneApplication
 * author : GGG
 * date : 2023-09-22
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-22         GGG          최초 생성
 */
public class SmartPhoneApplication {
    public static void main(String[] args) {
//       TODO : Phone 추상클래스 : 생성못함
//              활용 : 자식클래스를 만들어서 상속받아 사용
//              목적 : 프로젝트에서 개발자가 많을 때 함수이름과 속성이름을 통일시킬 목적으로 사용

//       Phone phone = new Phone("홍길동");
        SmartPhone smartPhone = new SmartPhone("홍길동");
        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
