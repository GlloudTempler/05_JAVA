package chap08.Sec01.exam01;

/**
 * packageName : chap08.Sec01.exam01
 * fileName : RemoteConrtl
 * author : GGG
 * date : 2023-09-22
 * description : 인터페이스
 * 요약 :
 *        인터페이스(추상클래스 : 부모클래스역할) : 추상클래스와 비슷,
 *                 내부에 정의되는 함수는 모두 추상함수가 됨
 *                 내부에 정의되는 속성은 모두 정적(공유)상수(static final)
 *        정의 사용법 : public interface 인터페이스명{}
 *        상속 사용법 : public class 자식 클래스명 implements 부모인터페이스1,...부모인터페이스n
 *        => 함수 재정의가 필요함
 *        목적 ㅣ 1) 프로젝트에서 이름(함수/속성) 표준화를 위해 사용
 *               2) 다형성 이용
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-22         GGG          최초 생성
 */
public interface RemoteControl {
//    TODO : 속성 == 정적(공유)상수
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 1;
//    TODO : 함수 == 추상함수(실행블럭{} 없음)
    void turnOn(); // 리모컨 켜기
    void turnOff(); // 리모컨 끄기
}
