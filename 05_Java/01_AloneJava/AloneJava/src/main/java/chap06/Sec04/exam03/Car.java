package chap06.Sec04.exam03;

/**
 * packageName : chap06.Sec04.exam03
 * fileName : CAr
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
public class Car {
    int gas; // 기름
//    속성에 값을 넣지 않고 1) 생성자를 이용해서 값을 넣거나
//                       2) setter를 이용해서 값을 수정
//    사용법 : void set속성명(int 속성명) {this.속성명 = 속성명;}
//    역할 : 속성의 값을 저장/수정하는 함수
    void setGas(int gas) {
        this.gas = gas;
    }

    /*
    * gas가 남아있는지 확인하는 함수
    * */
    boolean isLeftGas() {
        if(gas==0) {
            System.out.println("gas가 없습니다.");
            return false;
        }else {
            System.out.println("gas가 있습니다.");
            return true;
        }
    }
    /*
    * 자동차를 달리게 하는 함수 : 달리면 1씩 감소
    * */
    void run() {
        while(true) {
            
            if(gas > 0) {
                System.out.println("달립니다.(gas잔량 :" + gas + ")");
                gas = gas -1;
            }else {
                System.out.println("멈춥니다.(gas잔량 :" + gas + ")");
                return; // break와 동일한 효과
            }
        }
    }
}
