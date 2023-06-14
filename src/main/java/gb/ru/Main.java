package gb.ru;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
//

//

        String[][] arr = new String[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = String.format("%d",(int) (Math.random() * 10));
//                System.out.print(arr[i][j] + " ");
            }
        }

        try {
            System.out.println(arrSum(arr));
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getDiscription());
        } catch (MyArrayDataException e){
            System.out.println(e.toString());
        }



        arr[3][1] = "s";
        try {
            System.out.println(arrSum(arr));
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getDiscription());
        } catch (MyArrayDataException e){
            System.out.println(e.toString());
        }

        arr = Arrays.copyOf(arr, 3);
        try {
            System.out.println(arrSum(arr));
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getDiscription());
        } catch (MyArrayDataException e){
            System.out.println(e.toString());
        }


    }

    
        private static int arrSum(String[][] arr) throws MyArraySizeException{
            if((arr.length != 4) || (arr[0].length != 4)){
                throw new MyArraySizeException("Размер массива не равен предполагаемому", "Метод работает с двумерным массивом 4 на 4");
            }else{
                int sum = 0;
                for(int i = 0; i < arr.length; i++){
                    for (int j = 0; j < arr[i].length; j++){
                        boolean check = false;
                        try {
                            sum += Integer.parseInt(arr[i][j]);
                        }catch (NumberFormatException e){
                            throw new MyArrayDataException("Ошибка в строке", i, j);
                        }

                    }
                }
                return sum;
            }
        }

//    Далее метод должен пройтись по всем элементам массива, преобразовать в int и
//    просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в
//    ячейке лежит символ или текст вместо числа), должно быть брошено исключени
//    MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
}