import java.awt.*;
import java.util.ArrayList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //일반 변수 선언
        int num1 = 100;
        System.out.println(num1);
        num1 = 1000;
        System.out.println(num1);


        //상수선언
        final int num2 = 200;
        System.out.println(num2);
        //상수는 값의 변경이 불가하다. 그러므로 데이터를 변경하면 오류가 발생한다.

//        num2=2000;
//        System.out.println(num2);
//        final int num3;
//        num3=300;
//        System.out.println(num3);
//        한 번만 입력이 가능하다. 상수다..
//        num3=2000;
         System.out.println("----VAR키워드----");

         var price = 200;
         var name = "홍길동";
         var pi=3.14;
         var point = new Point();
         var v = new ArrayList<String>();
//         var test; var데이터 타입은 선언과 동시에 값을 저장해야 한다. 반드시!!

         System.out.println(price);
         System.out.println(name);
         System.out.println(pi);
         System.out.println(point);
         System.out.println(v);

    }
}