// Java 프로그래밍 - 변수와 자료형_3

import java.util.HashMap;
import java.util.Locale;

class Animal {
    String name;
    Double weight;
    String classification;


    Animal (String name, Double weight, String classification){
        this.name= name;
        this.weight= weight;
        this.classification= classification;
    }

    public void eat() {
        System.out.println("밥을 먹습니다");
    }

    public void sleep() {
        System.out.println("잠을 잡니다");
    }

    public void walk() {
        System.out.println("걷습니다");
    }

    public void run() {
        System.out.println("뜁니다");
    }

};



public class Main {
    public static void main(String[] args) {
        class Animal = new Animal;

        System.out.println("===Animal Info===");
        System.out.println(Animal(name, weight, classification));
        System.out.println(eat);
        System.out.println(sleep);
        System.out.println(walk);
        System.out.println(run);

//
//        int score = 100;
//        char grade = 0;
//
//        switch(score / 10) {
//            case 10:
//            case 9:
//                grade = 'A';
//                break;
//            case 8:
//                grade = 'B';
//                break;
//            case 7:
//                grade = 'C';
//                break;
//            default:
//                grade = 'F';
//                break;
//        }
//        System.out.println("grade = " + grade);

//        for (int i = 0; i < 7; i++) {
//            for (int j = 0; j < i + 1; j++) {
//                if(i % 2 == 0){
//                    i++;
//                    continue;
//                }
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        int waterTemperature = 0;
//
//        while(waterTemperature <= 100) {
//            waterTemperature++;
//            if(waterTemperature % 10 == 0) {
//            System.out.println("waterTemperature = " + waterTemperature + "도");}
//        }

//        int [][] testArray1 = {{0,0,0}, {0,0,0}, {0,0,0}};
//        for (int i = 0; i < testArray1.length; i++) {
//            for (int j = 0; j < testArray1[i].length; j++) {
//                testArray1[i][j] = 1;
//                if(i==j){
//                    testArray1[i][j] = 10;
//                }
//            }
//        }
//        for (int[] itemRow: testArray1){
//            for (int itemCol: itemRow){
//                System.out.print(itemCol + " ");
//            } System.out.println();
//        }






    }
}
