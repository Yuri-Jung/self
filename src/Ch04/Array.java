package Ch04;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//    System.out.println("알파벳 하나를 치세요");
//
//    String s = scanner.next();
//    char c = s.charAt(0);

//    for(char i='a'; i<=c; i++){
//        for(char j=i; j<=c; j++){
//            System.out.print(j);
//        }
//        System.out.println();
//    }

//        for(char i = 'd'; i<=c; i++){
//            for(char j=i; j<=c; j--){
//                System.out.println(j);
//            }
//            System.out.println();
//        }
//        int[]arr1 = new int [5];
//        System.out.println("정수 5개 입력하세요>>");
//        for(int i=0; i<= arr1.length; i++){
//            arr1[i] = scanner.nextInt();
//
//            if(arr1[i]%3==0){
//                System.out.print(arr1[i]);
//            }
//        }

        String eng[] = {"student", "love", "java", "happy", "future"};
        String kor[] = {"학생", "사랑", "자바", "행복한", "미래"};


        while (true) {
            System.out.println("영어단어를 입력하세요>>");
            String word = scanner.next();

            if (word.equals("exit")) {
                System.out.println("종료합니다..");
                break;
            }
            else {
                for (int i = 0; i < eng.length; i++) {
                    if (word.equals(eng[i])) {
                        System.out.println(kor[i]);
                        break;
                    } else if(!word.equals(eng[i])){
                        System.out.println("그런 영어 단어가 없습니다.");
                    }
                }
            }

//          if(eng.equals(kor)){
//              System.out.println(eng[]);
//          }
//          else{
//              System.out.println("그런 영어단어는 없습니다.");
//          }
//        }

        }
    }
}