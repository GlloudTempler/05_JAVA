package chap13.Sec01.exam03;

/**
 * packageName : chap12.sec01.exam07
 * fileName : User1
 * author : ds
 * date : 2022-10-06
 * description : 작업쓰레드 1(상속받아 만듬)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-06         ds          최초 생성
 */
public class User1 extends Thread{
//    TODO : 계산기 클래스 속성
    private Calculator calculator;
//    TODO : setter 함수
    public void setCalculator(Calculator calculator) {

        this.setName("User1");
        this.calculator = calculator;
    }

//    TODO : 쓰레드 run 함수 : 계산기의 속성 memory 값 : 50
    public void run() {
        calculator.setMemory(50);
    }
}







