package chap06.Sec05.exam04;

/**
 * packageName : chap06.Sec05.exam04
 * fileName : SingletonApplication
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
public class SingletonApplication {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance(); // 공유(정적) 함수 호출
        Singleton singleton2 = Singleton.getInstance(); // 공유(정적) 함수 호출
        
//        TODO : 같은 주소(방번호) 갖는 지 확인 : 공유객체인지 확인
//               비교연산자(=)
        if(singleton1 == singleton2) {
            System.out.println("같은 공유 객체입니다.");
        }else {
            System.out.println("다른 객체입니다.");
        }
    }
}
