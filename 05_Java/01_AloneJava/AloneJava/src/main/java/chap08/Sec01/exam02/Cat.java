package chap08.Sec01.exam02;

/**
 * packageName : chap08.Sec01.exam02
 * fileName : Cat
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
public class Cat implements Soundable{
    @Override
    public String sound() {
        return "냥";
    }
}