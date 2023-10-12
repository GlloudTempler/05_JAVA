package chap07.Sec01.exam02;

/**
 * packageName : chap07.Sec01.exam02
 * fileName : CalculatorApplication
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
public class CalculatorApplication {
    public static void main(String[] args) {
        int r = 10;
        Calculator calculator = new Calculator();
        System.out.println("원면적 : " + calculator.areaCircle(r));
        System.out.println("----------------------");

        Computer computer = new Computer();
//        TODO 부모함수 areaCircle() vs 자식함수 areaCircle()
        System.out.println("원면적 : " + computer.areaCircle(r));
    }
}
