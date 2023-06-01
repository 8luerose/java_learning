public class Casting {
    public static void main(String[] args){
        double a = 1.1;
        double b = 1;               //double 형으로 컨버팅 1 -> 1.0 으로 출력
        //double b = (double)1      이것과 같은 뜻이다
        System.out.println(b);
        //int c = 1.1;              //1.1은 int 형이 아니다. 잘못된 것.
        int d = (int)1.1;           //강제로 캐스팅 해준 것 (= 소수점 손실 발생)
        System.out.println(d);

        // 3은 int인데 어떻게 string으로 바꾸지?
        // integer to String == Integer.toString(3)
        String f = Integer.toString(3);    //정수.to문자열 = Integer.toString()
        System.out.println(f);
        // 어? 정수에서 문자열로 바뀌었다고? '데이터 타입'을 확인하고 싶은데?
        System.out.println(f.getClass());    //.getClass() = 데이터 타입 확인 가능
        // class java.lang.String == 이것은 'String' 이다 라는 뜻
    }
}
