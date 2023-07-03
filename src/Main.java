// Java 프로그래밍 - 변수와 자료형_3

import java.util.HashMap;
import java.util.Locale;

//class Animal {
//    String name;
//    Double weight;
//    String classification;
//
//
//    Animal (String name, Double weight, String classification){
//        this.name= name;
//        this.weight= weight;
//        this.classification= classification;
//    }
//
//    public void printAnimalInfo(){
//        System.out.println("name = " + name);
//        System.out.println("weight = " + weight);
//        System.out.println("classification = " + classification);
//    }
//
//    public void printAnimalInfo(int birth){
//        this.printAnimalInfo();
//        System.out.println("birth = " + birth);
//    }
//
//    public void printAnimalInfo(String location){
//        this.printAnimalInfo();
//        System.out.println("location = " + location);
//    }
//
//    public void printAnimalInfo(int birth, String location){
//        this.printAnimalInfo();
//        System.out.println("birth = " + birth);
//        System.out.println("location = " + location);
//    }
//
//    public void eat() {        System.out.println("밥을 먹습니다");    }
//    public void sleep() {        System.out.println("잠을 잡니다");    }
//    public void walk() {        System.out.println("걷습니다");   }
//    public void run() {        System.out.println("뜁니다");    }
//
//};

//class Calculator {
//
//    public int sum(int a, int b) {
//        return a + b;
//    }
//    public double sum(double a, double b) { return a + b;}
//    public int sum(String a, String b) {
//        return Integer.parseInt(a) + Integer.parseInt(b);
//    }
//    public int sum(int a, int b, int c) { return a + b + c;}
//
//}

//class Animal {
//    String desc;
//    Animal() {
//        this.desc = "동물 클래스 입니다.";
//    }
//
//    Animal(String desc) {
//        this.desc = desc;
//    }
//
//    public void printInfo() {
//        System.out.println(this.desc);
//    }
//}
//
//class Cat extends Animal {
//    String desc;
//    Cat() {
//        super.desc = "고양이 입니다.";
//        super("고양이 입니다.");
//    }
//}

//class Car {
//    Car(){}
//    public void horn() {
//        System.out.println("빵빵!");
//    }
//}
//
//class FireTruck extends Car {
//    public void horn() {
//        horn();
//        super.horn("위이잉!");
//    }
//}
//
//class Ambulance extends Car {
//    public void horn() {
//        Car.horn();
//        super.horn = "삐뽀삐뽀!";
//    }
//}




public class Main {
    public static void main(String[] args) {



//        FireTruck truck = new FireTruck();
//        truck.horn();
//
//        Ambulance amb = new Ambulance();
//        amb.horn();

//        Cat cat = new Cat();
//        cat.printInfo();


//        Calculator c = new Calculator();
//        System.out.println(c.sum(1, 2));
//        System.out.println(c.sum(1.0, 2.0));
//        System.out.println(c.sum("1", "2"));
//        System.out.println(c.sum(1, 2, 3));

//        Animal animal1 = new Animal("강아지", 5.0, "포유류");
//        Animal animal2 = new Animal("구피", 0.01, "어류");
//        animal1.printAnimalInfo();
//
//        animal1.printAnimalInfo(19930129);
//        animal1.printAnimalInfo("Incheon");
//        animal1.printAnimalInfo(19961227, "Korea");
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
