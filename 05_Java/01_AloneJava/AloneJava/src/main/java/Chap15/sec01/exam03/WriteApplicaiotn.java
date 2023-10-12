package Chap15.sec01.exam03;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * packageName : Chap15.sec01.exam03
 * fileName : WriteApplicaiotn
 * author : GGG
 * date : 2023-09-27
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-27         GGG          최초 생성
 */
public class WriteApplicaiotn {
    public static void main(String[] args) throws Exception{
//        TODO : 파일을 쓰기용(출력용)으로 열기
        OutputStream outputStream =
                new FileOutputStream("src/main/resources/test3.txt");
//        TODO : 배열 일부만 쓰기
        byte[] array = {10,20,30,40,50};
//        TODO : outStream.write(배열변수, 시작인덱스, 개수)
        outputStream.write(array, 1, 3);
//        TODO : 버퍼 -> 파일
        outputStream.flush();
        outputStream.close();
    }
}
