package Chap12.Sec02.exam02;

import java.util.LinkedList;
import java.util.Queue;

/**
 * packageName : Chap12.Sec02.exam02
 * fileName : MessageApplication
 * author : GGG
 * date : 2023-09-26
 * description : 큐 소개 : FIFO
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-26         GGG          최초 생성
 */
public class MessageApplication {
    public static void main(String[] args) {
//        큐(인터페이스) 객체 생성
        Queue<Message> messageQueue = new LinkedList<>();

//        TODO : 큐에 자료 저장 : .offer(값) / .add(값)
        messageQueue.offer(new Message("sendMail", "홍길동"));
        messageQueue.offer(new Message("SMS", "신용권"));
        messageQueue.offer(new Message("sendKakao", "홍두깨"));
//        TODO : 꺼내기 : .poil()
        while (messageQueue.isEmpty() == false) {
            Message message = messageQueue.poll(); // 1st 꺼내기
            System.out.println(message.to); // 보낼 사람 이름
        }
    }
}
