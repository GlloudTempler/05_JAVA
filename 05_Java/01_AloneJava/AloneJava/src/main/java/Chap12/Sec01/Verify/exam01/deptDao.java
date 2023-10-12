package Chap12.Sec01.Verify.exam01;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName : Chap12.Sec01.Verify.exam01
 * fileName : DeptDao
 * author : GGG
 * date : 2023-09-25
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-25         GGG          최초 생성
 */
public class deptDao {
    public List<Dept> createDept() {
        List<Dept> list = new ArrayList<>();
//        TODO : 아래 코드를 완성
        list.add(new Dept(10,"Sales", "부산"));
        list.add(new Dept(20,"Marketing", "서울"));
        list.add(new Dept(30,"Research", "대전"));
        return list;
    }
}
