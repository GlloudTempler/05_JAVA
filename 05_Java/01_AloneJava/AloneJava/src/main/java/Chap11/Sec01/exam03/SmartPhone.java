package Chap11.Sec01.exam03;

/**
 * packageName : Chap11.Sec01.exam03
 * fileName : SmartPhone
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
public class SmartPhone {
//    TODO 속성
    private String company; // 제조사
    private String os; // 운영체제
//    TODO 생성자

    public SmartPhone() {
    }

    public SmartPhone(String company, String os) {
        this.company = company;
        this.os = os;

    }
//    TODO : toString() 객체의 속성을 화면에 출력할 수 있음

    @Override
    public String toString() {
        return "SmartPhone{" +
                "company='" + company + '\'' +
                ", os='" + os + '\'' +
                '}';
    }
}
