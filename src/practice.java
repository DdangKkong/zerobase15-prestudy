public class practice {
    // int age = 20;
    // int는 integer를 말하며 정수형 변수
    // system.out.println(age);
    // system.out.println(country);
    // string country = "Korea";
    // string은 문자열 데이터 변수

    // 카멜(낙타) 표기법 - myName, zeroBase

    // 파스칼 표기법 - MyName, ZeroBase

    /*
    Integer, System 처럼 맨 앞을 대문자로해야되는것도 있구나
    (long)integer.MAX_VALUE + 1; 앞에 괄호해서 붙여주면 변수 변환이된다
    float는 실수형 변수로 float floatNum = 1.27f; 처럼 숫자 뒤에 f 를 붙여줘야 float인것을 인식한다
    double도 실수형 변수고 f는 안붙여도 된다.
    2진수는 0b, 8진수는 0, 16진수는 0x 붙이고 뒤에 숫자를 써야한다
    부울 자료형 boolean은 ture, false를 넣고
    문자 자료형 char은 작은따옴표 안에 문자 하나만 써야한다.

    문자열 변수 String, 쌍따옴표 사용한다, 숫자도 "" 안에 들어가있으면 문자열
    두 데이터를 비교할 때 System.out.println(데이터1.equals(데이터2)); 를 쓴다. 근데 얘는 데이터의 값을 비교하는거
        이것도 된대 System.out.println(데이터1 == 데이터2);  얘는 객체를 비교한대 그래서 new String 같은걸로 생성하면 다르다고나와
    변수.indexof("데이터");는 문자열 데이터가 있을때 지정한 데이터가 몇번째에 있는지 알려줌, 중복된 데이터가 있을때는 앞에것만 찾아줌
    System.out.println(변수.substring(0, 3));는 변수가 가지고 있는 문자열 데이터에서 0번부터 3번째 데이터까지(0,1,2) 출력해준다
        substring과 indexof를 조합하면 원하는 문자열까지 출력가능하다
    StringBuffer로 변수 선언하고 안에 담긴 데이터를 바꾸면 객체는 바뀌지 않고 데이터만 바뀐다. 객체를 또 만들지 않아서 속도면에서 좋음
        반면에 String으로 변수 만들면 객체도 바뀌기 때문에 자주 바뀌는 데이터라면 StringBuffer로 선언하는게 좋다
    자료형 변수 ArrayList는 [1, hello, 2, 3, 4, world!] 처럼 만들 수 있다
        변수.sort(Comparator.naturalOrder()); 는 오름차순, 변수.sort(Comparator.reverseOrder()); 는 내림차순 정렬
        변수.contains(데이터); 는 데이터가 변수에 들어있는지를 true나 false로 출력해준다
    HashMap으로 변수 선언하면 여러가지 데이터를 합쳐서 저장할 수 있다
        map.put("kiwi", 9000); map.put(10000, "apple"); (앞자리가 key, 뒷자리가 value) 하면 출력시 map = {kiwi=9000, 10000=apple} 으로 출력된다
        변수.containsKey("데이터");는 key에 데이터와 일치하는 데이터가 있는지 여부를 true, false로 알려준다

    연산자 % 는 나머지를 구하는거고, 변수 % 2; 요건 2로 나눴을때의 나머지를 구하는거
    연산자 ++, -- / int num=1; 일때 System.out.println(num++);면 1이 출력된 후에 num값이 2로 바뀐다
    관계 연산자 / ==는 같은가, !=는 다른가를 본다
    복합 대입 연산자 / num1 += num2; 이거는 num1 = num1 + num2; 와 같다 / 유사하게 -=, *= 도 있다.
    삼항 연산자 / 이건 if문이랑 똑같은것 같은데 (부울변수) ? "yes" : "no"; 이건 부울변수가 true면 yes, false면 no를 출력한다

    보수 라는건 음수라고도 표현하고 '2진수 3의 2의 보수'라 함은 더했을때 자릿수가 올라가는 최소 수를 의미하는듯, 답은 2진수 01.
    2진수 연산자인듯
        비트 연산자 (&, |, ^, ~) / ^는 XOR 연산자래 두개의 비트 값이 같으면(한자리씩 비교) 0, 다르면 1.
        ~는 반전 연산자래 비트 값이 0이면 1로, 1이면 0으로 바꿔준대. 10진수 앞에 ~를 쓰네 (~5 = -6이 된대)
        이동 연산자 (<<, >>, >>>) / <<는 좌측으로 한칸씩 (결국 값이 2배가 되고),
            >>는 오른쪽으로 한칸씩이고 빈칸은 원래 비트연산자의 값을 그대로 가져가 (결국 값이 1/2가 된다, 나머지 버림),
            >>>도 오른쪽으로 한칸씩인데 원래 비트연산자 값 상관없이 0을 넣는대
        2진수로 출력하려면 Integer.toBinaryString(변수);를 하면돼 / 이때 출력은 println말고 printf를 쓴다
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(변수)));
            에서 04는 4자리수를 만들되 빈자리는 0을 채운다는 이야기, %d는 정수형 데이터를 받을수있는 서식 문자래
            위 식은 4자리수를 만드는 식!
            반전 연산자 ~ 는 "%s\n" 으로 쓰네

    조건문 if, switch / swich는 case별로 조건을 붙이는 조건문
    반복문 for / for(초기치; 조건문; 증가치;){반복하여 실행할 내용;}
        while / while(조건문) {반복하여 실행할 내용;} 요건 조건 해당시 반복해서 실행한다
        do while / do {반복하여 실행할 내용;} while (조건문); 요건 일단 한번 반복하고 조건 맞으면 계속 반복한다
        continue; 는 해당하는 조건시 밑에 내용을 실행하지 않고 그 다음단계로 가게하고
        break; 는 해당하는 조건시 반복문을 아예 빠져나오게 해서 더 이상 실행하지 않도록 한다
        for each / for (int 변수 : 반복하고자하는대상) {System.out.println(변수);} 반복하고자하는대상의 데이터를 하나씩 출력
    System.out.println(); 요거에서 ln 의 역할은 줄을 바꿔주는것!
    int[] 변수 = {1,2,3,4,5}; 요거는 1차원 배열 /
    int[][] 변수 = {{1,2,3},{4,5,6}}; 은 다차원 배열 중 2차원 배열 / [행] [열]
        for each 로 myArray2(2차원 변수)데이터 나열하기 / for(int[] ints : myArray2){ for(int anInt : ints){soutv(anInt);}
    int[][][] 변수 = {{{1,2},{3,4}},{{5,6},{7,8}}}; 은 다차원 배열 중 3차원 배열 /
        출력시 for (int[] itemRow: 변수){ for (int itemCol: itemRow){ System.out.print(itemCol + " ");} System.out.println();} 처럼 쓴다

    클래스와 객체 / class는 객체를 만들고 이루어가는 설계도
    클래스를 만들고 변수 선언(이때 클래스의 특성에 관한 변수를 넣어주고) > (클래스로 생성한)변수 설명해주며 생성자 호출 > 변수를 프린트하는 함수 넣고 >
        메소드들을 넣고(이때 클래스의 기능에 대한 정보들을 넣어준다) > 클래스를 객체로 만들고 > 변수를 프린스하는 함수로 출력

    오버로딩으로 기존에 있는 함수도 () 안에만 다른 함수나 조합을 넣어주면 함수를 업데이트 할 수 있다.

    String 변수를 Double로 변환 / Double.parseDouble(변수);
    String 변수를 Int로 변환 / Integer.parseIng(변수);

    상속 / class 자식클래스명 extends 부모클래스명 { ~~~~ }
    super / 부모클래스의 변수 덮어쓰거나 호출할때 사용했어

    추상 클래스 abstract / 꼭 구현해야할 기능들을 설정해놔서 상속받으면 그 기능들을 꼭 구현해야된대
        클래스를 상속 받은 이후에 오른쪽마우스 > Generate > Implement Methods... > OK 누르면 자동으로 기능들 채울수 있게 양식을 짜줘















     */
}
