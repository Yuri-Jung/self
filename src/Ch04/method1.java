package Ch04;

import java.util.Scanner;

public class method1 {


//1.매개변수, 반환값 둘 다 없다
//2.매개변수 없고 반환값 있다
//3.매개변수 있고 반환값 없다
//4.매개변수, 반환값 둘 다 있다


//문제1) 사칙연산을 하기위한 메서드를 메서드의 4가지 형태로 각각 생성하여
//        실행하는 프로그램을 작성하시오.
//        1.더하기, 빼기, 곱하기, 나누기 를 각각 4가지 형태로 생성
//        2. 1번타입의 함수 이름: sum1,sub1,multi1,div1
//           2번 타입 함수이름:sum2,sub2,multi2,div2
//           3번 타입 함수이름:sum3,sub3,multi3,div3
//           4번 타입 함수이름:sum4,sub4,multi4,div4

//    public static void sum1() {
//        int num1 = 10;
//        int num2 = 20;
//        int result = num1 + num2;
//        System.out.println("1번. 두 수의 합은 " + result);
//    }
//
//    public static int sub2(){
//        int num1 = 10;
//        int num2 = 20;
//        int result = num1 - num2;
//        return result;
//    }
//
//    public static int multi3(int num1, int num2){
//        return (num1 * num2);
//    }
//
//    public static void div4(int num1, int num2){
//        int result = num1 / num2;
//        System.out.println("4번 두 수의 나눔은 " + result);
//    }
//
//// 문제2) 사용자 입력을 통해서 (2-9)숫자를 입력받아 해당하는 단수의 구구단을
////        출력하는 프로그램을 작성하세요
////        1. 구구단을 출력하는 부분을 함수로 구현(함수명:gugudan)
////        2. 사용자 입력 부분은 함수로 구현해도 되고 안해도 된다. 형태는 상관없다.
//
//    int dan = inputDan();
//
//    public static int inputDan(){
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("보고 싶은 단을 입력하세요");
//        int dan = scanner.nextInt();
//
//        return dan;
//    }
//
//    public static void gugudan(int dan){
//        System.out.println("====" + dan + "단====");
//        for(int i=1; i<10; i++){
//            int result = (dan * i);
//            System.out.println(dan + "*" + i + "=" + result);
//        }
//    }


// 문제3) 사용자 입력을 통해서 국어, 영어, 수학의 점수 3개를 입력받고
//        해당하는 총점과 평균, 등급을 출력하는 프로그램을 작성하시오.
//        1. 등급 계산부분을 함수로 구현(함수명:scores/ as if문)
//        2. 총점과 평균 계산 부분을 함수로 구현(함수명: average)

//    int score1 = inputScore();
//    int cResult = average(score1);
//
//
//    public static int inputScore(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("국어, 영어, 수학 점수를 입력해주세요");
//        int kor = scanner.nextInt();
//        int eng = scanner.nextInt();
//        int math = scanner.nextInt();
//
//        int score = kor + eng + math;
//        return score;
//
//    }
//
//    public static int average(int score1){
//        int cResult = score1/3;
//        return cResult;
//    }
//
//    public static void aClass(int cResult){
//        if(cResult>90) {
//            if (cResult >= 95) System.out.println("A+");
//            else System.out.println("A");
//        }
//        else if (cResult>80) {
//            if(cResult>=85) System.out.println("B+");
//            else System.out.println("B");
//        }
//        else if (cResult>70){
//            if(cResult>=75) System.out.println("C+");
//            else System.out.println("C");
//        }
//        else if(cResult>60){
//            if(cResult>=65) System.out.println("D");
//            else System.out.println("D");
//        }
//        else System.out.println("F");
//
//    }

//문제 1) 책 126페이지의 5번 문제를 풀고, 메서드를 사용하는 방식으로 변환하세요
//        Arrays클래스의 정렬 메서드 sort()를 사용하여 정렬



}