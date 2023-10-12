package Chap10.Sec02.exam02;

/**
 * packageName : Chap10.Sec02.exam02
 * fileName : TryCatch2Application
 * author : GGG
 * date : 2023-09-26
 * description : 예외처리2
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-26         GGG          최초 생성
 */
public class TryCatch2Application {
    public static void main(String[] args) {
//        TODO : Out of Bound 에러 발생시키는 코드
//               현재 main의 매개변수는 기본적으로 없음
//        try~catch(){}
        String data1 = null;
        String data2 = null;
        try{
            data1 = args[0];
            data2 = args[1];

            System.out.println(data1); //에러 발생하면 -> catch로 이동
            System.out.println(data2);

        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("실행 매개변수값이 없습니다.");
        }

        try{
            int val1 = Integer.parseInt(data1);
            int val2 = Integer.parseInt(data2);
            System.out.println(val1);
            System.out.println(val2);
        }catch (NumberFormatException e) {
            System.out.println("숫자로 변환할 수 없습니다.");
        }finally {
            System.out.println("다시 실행하세요.");
        }

        }

}
