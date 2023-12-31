package chap07.Sec03.exam01;

/**
 * packageName : chap07.Sec03.exam01
 * fileName : Phone
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
public abstract class Phone {
    public String owner;
//    매개 1개짜리 생성자

    public Phone(String owner) {
        this.owner = owner;
    }
//    전원 키는 함수
    public void turnOn() {
        System.out.println("폰 전원을 켭니다.");
    }
    public void turnOff() {
        System.out.println("폰 전원을 끕니다.");
    }
}
