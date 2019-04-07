import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Ведіть місяць від 1 до 12");
        int s = sc1.nextInt();
        switch (s) {
            case 1: Months.M1();break;
            case 2: Months.M2();break;
            case 3: Months.M3();break;
            case 4: Months.M4();break;
            case 5: Months.M5();break;
            case 6: Months.M6();break;
            case 7: Months.M7();break;
            case 8: Months.M8();break;
            case 9: Months.M9();break;
            case 10: Months.M10();break;
            case 11: Months.M11();break;
            case 12: Months.M12(); break;
            default: System.out.println("Не вірне число !"); break;
        }
    }}

//        while (sc1.hasNext("1")) {
//            int number  = sc1.nextInt();
//            Enums1.M1();}
//        if (sc1.hasNext("2")) {
//            int number = sc1.nextInt();
//            Enums1.M2();}
//        if (sc1.hasNext("3")) {
//            int number = sc1.nextInt();
//            Enums1.M3();}
//        if (sc1.hasNext("4")) {
//            int number = sc1.nextInt();
//            Enums1.M4();}
//        if (sc1.hasNext("5")) {
//            int number = sc1.nextInt();
//            Enums1.M5();}
//        if (sc1.hasNext("6")) {
//            int number = sc1.nextInt();
//            Enums1.M6();}
//        if (sc1.hasNext("7")) {
//            int number = sc1.nextInt();
//            Enums1.M7();}
//        if (sc1.hasNext("8")) {
//            int number = sc1.nextInt();
//            Enums1.M8();}
//        if (sc1.hasNext("9")) {
//            int number = sc1.nextInt();
//            Enums1.M9();}
//        if (sc1.hasNext("10")) {
//            int number = sc1.nextInt();
//            Enums1.M10();}
//        if (sc1.hasNext("11")) {
//            int number = sc1.nextInt();
//            Enums1.M11();}
//        if (sc1.hasNext("12")) {
//            int number = sc1.nextInt();
//            Enums1.M12();}
//        System.out.println("Можете спробувати ще раз");
//    }


