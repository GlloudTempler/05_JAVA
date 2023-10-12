package chap07.Verify.exam12;

/**
 * packageName : chap07.Verify.exam12
 * fileName : Notebook
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
public class Notebook extends Computer{
    @Override
    public void display() {
        System.out.println("NoteBook Display()");
    }

    @Override
    public void typing() {
        System.out.println("NoteBook Typing()");
    }
}
