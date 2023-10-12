package Chap15.sec02.exam03;

import java.io.*;

/**
 * packageName : chap14.sec02.exam02
 * fileName : NonBufferVsBufferApplicaton
 * author : ds
 * date : 2022-10-07
 * description : 파일 복사 성능 테스트( NonBuffer Vs Buffer )
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-07         ds          최초 생성
 */
public class BufferApplication {

    static int data = -1;
//    TODO : 정적(전역, 공유)함수 : 파일 copy 함수
    public static long copy(InputStream is, OutputStream os) throws Exception {
//        복사하는데 걸린 시간 체크 : 시작시간 체크
        long start = System.nanoTime();

//        복사 실행 코드
        while(true) {
            data = is.read(); // 읽기(원본)
            if(data == -1) break; // 반복문 종료 조건(파일의 끝 : -1)
            os.write(data); // 다른 파일에 쓰기(복사본)
        }

        long end = System.nanoTime();

        return (end - start);
    }

    public static void main(String[] args) throws Exception {
//        TODO : 원본 이미지 경로 지정
        String orgImgPath = "src/main/resources/images/boy.jpg"; // 일반 복사 파일
        String orgImgPath2 = "src/main/resources/images/girl.jpg"; // 버퍼 복사 파일

//        TODO : 복사본 이미지 경로 지정
        String cpyImgPath = "src/main/resources/images/boy_copy.jpg"; // 일반 복사 파일
        String cpyImgPath2 = "src/main/resources/images/girl_copy.jpg"; // 버퍼 복사 파일

//        TODO : 파일 읽기용 원본 이미지 접근
        FileInputStream fileInputStream
                = new FileInputStream(orgImgPath);
//        TODO : 파일 쓰기용 복사본 이미지 생성
        FileOutputStream fileOutputStream
                = new FileOutputStream(cpyImgPath);
//        TODO : 복사함수(copy)를 이용해서 복사본 이미지 생성 + 소요시간 측정(리턴)
        long nonBufferTime = copy(fileInputStream, fileOutputStream);
        System.out.println("버퍼를 사용하지 않았을때 :" + nonBufferTime + "ns");

        fileInputStream.close();
        fileOutputStream.close();

//        ------------------- 버퍼 써서 파일 복사 ------------------
//        TODO: 여기부터 코딩
//        TODO : 파일 읽기용으로 원본 이미지 접근 : girl.jpg
        FileInputStream fileInputStream2 = new FileInputStream(orgImgPath2);
//        TODO : 파일 쓰기용으로 복사본 이미지 생성 : (이미지경로 : cpyImgPath2)
        FileOutputStream fileOutputStream2 = new FileOutputStream(cpyImgPath2);
//        TODO : 보조스트림(buffer)적용 : new 보조스트림생성자(기본스트림)
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream2); // 읽기용(원본)
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream2); // 쓰기용(복사본)
//        TODO : 복사(copy)와 함께 소요시간(리턴값) 체크
        long bufferTime = copy(bufferedInputStream, bufferedOutputStream);
        System.out.println("버퍼사용 : " + bufferTime + "ns");

//        TODO : 파일 닫기
        bufferedInputStream.close();
        bufferedOutputStream.close();

    }
}