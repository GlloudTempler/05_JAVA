package Chap10.Sec02.exam03;

/**
 * packageName : Chap10.Sec02.exam03
 * fileName : CatchbyCatchApplication
 * author : GGG
 * date : 2023-09-26
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-26         GGG          최초 생성
 */
public class CatchByCatchApplication {
    public static void main(String[] args) {
        try{
            String data1 = args[0];
            String data2 = args[1];
            System.out.println(data1); //에러 발생
            System.out.println(data2);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("실행 매개 변수 값이 부족");
        }catch (NumberFormatException e) {
            System.out.println("숫자로 변환할 수 없음");
        }catch (Exception e) {
            // TODO : Exception -> 개발자 에러의 최고 조상 클래스 : 기본 에러로 설정하면 거의 탐지
            System.out.println("이 외의 다른 에러");
        }
    }
    
}
