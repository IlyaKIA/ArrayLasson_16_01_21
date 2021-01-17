import java.util.Arrays;

public class Main {

    public static void main (String [] args) {

        // Задание 1:
        byte arrayBit [] = new byte[10];
        for(int i = 0; i < arrayBit.length; i++) {
            arrayBit[i] = (byte) (Math.random() * 2);
        }
//        for(int i = 0; i < arrayBit.length; i++) {
//            System.out.print(arrayBit[i] + " ");
//        }
        for(int i = 0; i < arrayBit.length; i++) {
            if (arrayBit[i] == 0) {
                arrayBit[i] = 1;
            } else {
                arrayBit[i] = 0;
            }
        }
//        System.out.println("");
//        for(int i = 0; i < arrayBit.length; i++) {
//            System.out.print(arrayBit[i] + " ");
//        }
//        System.out.println("");

        // Задание 2:
        int arrayPlus3 [] = new int[8];
        int x = -3;
        for(int i = 0; i < arrayPlus3.length; i++) {
            arrayPlus3[i] = x += 3;
        }
//        System.out.println("");
//        for(int i = 0; i < arrayPlus3.length; i++) {
//            System.out.print(arrayPlus3[i] + " ");
//        }
//        System.out.println("");

        // Задание 3:
        int [] arrayLess6Multi2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i =0; i < arrayLess6Multi2.length;  i++) {
            if (arrayLess6Multi2[i] < 6) {
                arrayLess6Multi2[i] *= 2;
            }
        }

//        for(int i = 0; i < arrayLess6Multi2.length; i++) {
//            System.out.print(arrayLess6Multi2[i] + " ");
//        }
//        System.out.println("");


        // Задание 4:
        int arrDiagonal [][] = new int [10] [10];
        for (int i = 0; i < arrDiagonal.length; i++){
            for(int j = 0; j < arrDiagonal[i].length; j++){
                if (i == j || i + j == arrDiagonal[i].length - 1) {
                    arrDiagonal[i][j] = 1;
                }
            }
        }

//        for (int i = 0; i < arrDiagonal.length; i++){
//            for(int j = 0; j < arrDiagonal[i].length; j++){
//                System.out.print(arrDiagonal[i][j] + " ");
//            }
//            System.out.println("");
//        }

        //Задание 5:
//        System.out.println("");
        int arrayMinMax [] = new int[10];
        for(int i = 0; i < arrayMinMax.length; i++) {
            arrayMinMax[i] = (int) (Math.random() * 50);
        }

        int min = arrayMinMax[0];
        int max = arrayMinMax[0];
        for(int i = 1; i < arrayMinMax.length; i++) {
            if (min > arrayMinMax[i]) {
                min = arrayMinMax[i];
            }
            if (max < arrayMinMax[i]) {
                max = arrayMinMax[i];
            }
        }
//        for(int i = 0; i < arrayMinMax.length; i++) {
//            System.out.print(arrayMinMax[i] + " ");
//        }
//        System.out.println("");
//        System.out.println("MIN = " + min + "; MAX = " + max);

        //Задание 6:
//        System.out.println("");
        int [] checkArr = {1, 1, 1, 2, 1};
        for(int i = 0; i < checkArr.length; i++) {
            System.out.print(checkArr[i] + " ");
        }
        System.out.println("Баланс: " + checkBalance(checkArr));

        //Задание 7:
        int arrToShift [] = {1,2,3,4,5,6,7,8,9,10};
//        System.out.println(Arrays.toString(arrToShift));

        arrToShift = shiftArray(arrToShift, -3);
//        System.out.println(Arrays.toString(arrToShift));

    }

    //Задание 6:
    public static boolean checkBalance (int [] checkArray){
        for  (int balanceLine = 1; balanceLine < checkArray.length - 1; balanceLine++) {
            int leftArr = 0;
            int rightArr = 0;
            for (int i = 0; i < checkArray.length; i++) {
                if (i < balanceLine){
                    leftArr += checkArray[i];
                } else {
                    rightArr += checkArray[i];
                }
            }
            if (leftArr == rightArr) {
                return true;
            }
        }
        return false;
    }

    //Задание 7:
    public static int[] shiftArray( int arr [], int n){
        //System.out.println(Arrays.toString(arr));
        if (n>=0) {
            for (int j = 0; j < n; j++) {
                int mamory = arr[0];
                for (int i = 0; i < arr.length - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[arr.length - 1] = mamory;
            }
        } else {
            for (int j = 0; j > n; j--) {
                int mamory = arr[arr.length - 1];
                for (int i = arr.length - 1; i > 0; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[0] = mamory;
            }
        }
        return arr;
        //System.out.println(Arrays.toString(arr));
    }
}
