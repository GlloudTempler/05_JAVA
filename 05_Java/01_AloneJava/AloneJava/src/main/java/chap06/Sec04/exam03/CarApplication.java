package chap06.Sec04.exam03;

/**
 * packageName : chap06.Sec04.exam03
 * fileName : CarApplication
 * author : GGG
 * date : 2023-09-20
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-20         GGG          최초 생성
 */
public class CarApplication {
    public static void main(String[] args) {
        Car car = new Car();
//        TODO 1) 기릅 주입
        car.setGas(5);
//        TODO 2) 남아있는 기름 확인
        boolean gasState = car.isLeftGas();
//        TODO 3) 출발
        if(gasState) {
            System.out.println("출발");
            car.run(); // 출발
        }
//       TODO 4) 기름 확인
        if(car.isLeftGas() == true) {
            System.out.println("gas를 넣을 필요가 없다.");
        } else {
            System.out.println("gas를 주입하세요.");
        }
    }
}
