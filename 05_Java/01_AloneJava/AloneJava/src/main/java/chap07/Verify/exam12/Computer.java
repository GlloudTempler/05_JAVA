package chap07.Verify.exam12;

/**
 * packageName : chap07.verify.exam0108
 * fileName : Computer
 * author : kangtaegyung
 * date : 2023/03/30
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/03/30         kangtaegyung          최초 생성
 */
public abstract class Computer {
    public abstract void display();
    public abstract void typing();
    public void turnOn()
    {
        System.out.println("전원을 켭니다.");
    }
    public void turnOff()
    {
        System.out.println("전원을 끕니다.");
    }
}
