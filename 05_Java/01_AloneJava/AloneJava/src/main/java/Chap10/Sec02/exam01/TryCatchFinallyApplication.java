package Chap10.Sec02.exam01;

/**
 * packageName : Chap10.Sec02.exam01
 * fileName : TryCatchFinallyApplication
 * author : GGG
 * date : 2023-09-26
 * description : 일반 예외 처리
 * 요약 :
 *       (참고) : 예외(개발자 에러) VS 시스템 에러(자바가상머신 에러)
 *       에러처리의 필요성 : 에러 발생 시 콘솔에 에러코드 발생
 *       => 사용자 입장에서 보기 좋지 않음
 *       => 목적)  에러 처리를 이용해서 좀 더 품질 좋은 프로그램을 만들기 위함
 *        ex) 에러 발생 -> 관리자가 확인 중입니다. 메세지 출력
 *
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-26         GGG          최초 생성
 */
public class TryCatchFinallyApplication {
    public static void main(String[] args) {
//        TODO : 예외 처리 : try ~ catch 구문 이용
//               사용법 : try{실행문;}catch(에러클래스 변수){에러처리실행문;}
        try {
//            forName(클래스명) : 클래스명에 해당되는 자바클래스를 리턴
            Class classt = Class.forName("String2"); // 에러 발생
        }catch (ClassNotFoundException e) {
            System.out.println("클래스가 존재하지 않습니다.");
        }
    }
}
