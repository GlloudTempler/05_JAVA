package chap07.Sec01.exam03;

/**
 * packageName : chap07.Sec01.exam03
 * fileName : SupersonicAirplane
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
public class SupersonicAirplane extends Airplane {
//    속성 : 모드 바꿈 속성
    public static final String NORMAL = "NORMAL";
    public static final String SUPERSONIC = "SUPERSONIC";

    public String flyMode = NORMAL; //기본모드 : 최초에 노말

    /*
    * fly()함수에 모드 선택 추가 : 오버라이딩(메소드 재정의)
    * */

    @Override
    public void fly() {
        if(flyMode.equals(SUPERSONIC)){
            System.out.println("Supersocit Fly");
        }else {
//            System.out.println("Fly"); ==
//            TODO : super.함수() : 부모쪽에 있는 함수 호출
            super.fly();
        }
    }
}
