package chap07.Sec01.exam04;

/**
 * packageName : chap07.Sec01.exam04
 * fileName : CellPhone
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
public class CellPhone {
    String model;
    String color;

//    함수 : 기능
    /*
    * 전원 켜기 함수
    * */
    void powerOn() {
        System.out.println("전원을 켭니다.");
    }
    /*
    * 벨 함수
    * */
    void bell() {
        System.out.println("벨이 울립니다.");
    }

    /*
    * 통화기능 함수 : 송신
    * */
    void sendVoice(String message) {
        System.out.println("나 : " + message);
    }

    /*
    * 통화기능 함수 : 수신
    * */
    void recieveVoice(String message) {
        System.out.println("상대방 : " + message);
    }
    /*
    * 전화 꾾기
    * */
    void hangUp() {
        System.out.println("전화를 끊습니다.");
    }

}
