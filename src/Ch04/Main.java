package Ch04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//    method1.sum1();
//
//    int result2 = method1.sub2();
//    System.out.println("2번. 두 수의 차는 "+result2);
//
//    int num1 = 50;
//    int num2 = 5;
//
//    System.out.println("3번 두 수의 곱은 " + method1.multi3(num1,num2));
//    method1.div4(num1,num2);

//    method1.gugudan(method1.inputDan());

//    inputScore();
//    average(inputScore());
//    aClass(average(inputScore()));
//    }
//
//    int score1 = inputScore();
//    int cResult = average(score1);


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
//        문제 1) 책 126페이지의 5번 문제를 풀고, 메서드를 사용하는 방식으로 변환하세요
//        Arrays클래스의 정렬 메서드 sort()를 사용하여 정렬

        int arr1[]= new int[3];
        Scanner scanner = new Scanner(System.in);

        for(int i=0; i < arr1.length; i++) {
            System.out.println("정수 3개 입력 >>");
            arr1[i] = scanner.nextInt();
        }

    }
}
