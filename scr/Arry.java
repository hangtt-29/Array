import java.util.Scanner;

public class Arry {
    static int[] returnArray() {
        Scanner sn = new Scanner(System.in);
        System.out.println("Nhập vào độ dài của 1 mảng:");
        int input = sn.nextInt();
        int iarry[] = new int[input];
        for (int i = 0; i < iarry.length; i++) {
            Scanner n = new Scanner(System.in);
            System.out.println("Số phần tử thứ:" + i);
            iarry[i] = n.nextInt();
        }
        return iarry;
    }

    static void timChuoi(int[] iarry) {
        System.out.println("In ra các mảng trên");
        for (int i = 0; i < iarry.length; i++) {
            System.out.printf(iarry[i] + "\t");
        }
    }

    static void timMax(int[] iarry) {
        int max = iarry[0];
        for (int i = 0; i < iarry.length; i++) {
            if (max < iarry[i]) {
                max = iarry[i];
            }
        }
        System.out.println("Phần tử lớn nhất là: " + max);
        //in ra index của phần tử đó
        System.out.println("In ra index của phần từ lởn nhất: ");
        for (int i = 0; i < iarry.length; i++) {
            if (max == iarry[i]) {
                System.out.print("\t"+i);
            }
        }


    }

//    static void timMax02(int[] iarry) {
//        int max2 = 0;
//        int sencod= 0;
//
//        for (int i = 0; i < iarry.length-1; i++) {
//            if (iarry[i]>max2) {
//                sencod= max2;
//                max2 = iarry[i];
//            }
//        }
//        System.out.println("Phần tử thứ 2 nhất là: " + sencod);
//        System.out.println("In ra index của phần từ lớn thứ 2 là: ");
//        for (int i = 0; i < iarry.length; i++) {
//                if (iarry[i]==sencod){
//                    System.out.print("\t"+i);
//                }
//            }
//
//
//    }

    static void timMin(int[] iarry) {
        //In ra phần tử nhỏ nhất
        int min = iarry[0];
        for (int i = 0; i < iarry.length; i++) {
            if (min > iarry[i]) {
                min = iarry[i];
            }
        }
        System.out.println("Phần tử thứ nhỏ nhất là: " + min);
        //In ra index nhỏ nhất
        System.out.println("In ra index nhỏ nhất là:" );
        for (int i = 0; i < iarry.length; i++) {
            if (min == iarry[i]) {
                System.out.print("\t" +i);
            }
        }
    }
}
