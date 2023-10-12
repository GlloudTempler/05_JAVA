package chap07.Sec01.exam03;

/**
 * packageName : chap07.Sec01.exam03
 * fileName : SupersonicAirplaneApplication
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
public class SupersonicAirplaneApplication {
    public static void main(String[] args) {
        SupersonicAirplane supersonicAirplane = new SupersonicAirplane();
        supersonicAirplane.takeoff(); // 부모 이륙 함수
        supersonicAirplane.fly(); // 부모 비행 함수
//        TODO : 모드 변경 : 기본 -> 슈퍼소닉 모드
        supersonicAirplane.flyMode = SupersonicAirplane.SUPERSONIC;
        supersonicAirplane.fly();   // 자식 fly() 실행
        supersonicAirplane.land();  // 부모 착륙 함수
    }
}
