package Chap12.Sec01.exam02;

import java.util.Objects;

/**
 * packageName : Chap12.Sec01.exam02
 * fileName : Board
 * author : GGG
 * date : 2023-09-25
 * description : Board 객체를 저장하는 Vector
 * 요약 :
 *       Vector : 멀티쓰레드 환경에서 사용하는 자료구조, arraylist와 거의 유사
 *                (병렬처리 : 속도 향상 (장점), 코딩 복잡도 증가(동기화문제))
 *                속도 : arratlist > vector
 *
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-25         GGG          최초 생성
 */
public class Board {
    String subject;
    String content;
    String writer;
//    생성자

    public Board(String subject, String content, String writer) {
        this.subject = subject;
        this.content = content;
        this.writer = writer;
    }
//    hashcode, equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Board board = (Board) o;
        return Objects.equals(subject, board.subject) && Objects.equals(content, board.content) && Objects.equals(writer, board.writer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subject, content, writer);
    }

//    TODO : 편리성 증진 : 함수재정의 toString() : 객체를 문자열로 변환하는 함수

    @Override
    public String toString() {
        return "[" + subject + "," + content + "," + writer + "]";
    }
}
