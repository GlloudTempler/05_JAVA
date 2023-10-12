package chap06.sec02.exam02;

/**
 * packageName : chap06.sec02.exam02
 * fileName : FieldApplication
 * author : GGG
 * date : 2023-09-20
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-20         GGG          최초 생성
 */
public class FieldApplication {
    public static void main(String[] args) {
//        객체 생성 : new연산자(힙방에 해당객체 생성)
//        TODO : 클래스명 명명법 : 첫글자 대문자 나머지 소문자 단어와 단어 사이 대문자(파스칼표기법)
        FieldInit fieldInit = new FieldInit();
//        TODO : FieldInit의 모든 속성 출력
        System.out.println(fieldInit.bField);
        System.out.println(fieldInit.sField);
        System.out.println(fieldInit.iField);
        System.out.println(fieldInit.fField);
        System.out.println(fieldInit.lField);
        System.out.println(fieldInit.dField);
        System.out.println(fieldInit.boField);
        System.out.println(fieldInit.cField);
        System.out.println(fieldInit.arrField);
        System.out.println(fieldInit.strField);

    }

}
