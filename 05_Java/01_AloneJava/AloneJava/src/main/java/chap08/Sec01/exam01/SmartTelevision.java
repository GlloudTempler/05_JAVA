package chap08.Sec01.exam01;

/**
 * packageName : chap08.Sec01.exam01
 * fileName : SmartTelevision
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
public class SmartTelevision implements RemoteControl, Searchable{
//    함수 재정의 : 매서드 구현

    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    @Override
    public void search(String url) {
        System.out.println(url + "를 검색합니다.");
    }
}
