package site.metacoding.ex23;

public class ThreadEx01 {

    // main 스레드 시작
    public static void main(String[] args) {
        System.out.println(1);
        try {
            Thread.sleep(2000); // millis 1/1000초. ex) 2초 = 2000
        } catch (Exception e) {
            e.printStackTrace();
        } 
        System.out.println(2);
    }
}
