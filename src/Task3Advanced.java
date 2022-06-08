/*
	Создать два массива чисел:
	1,2,5,7,10
	2,3,2,17,15
	Создать массив чисел, в котором будут: все числа из этих двух массивов,
	и результат умножения чисел с одинаковым порядковым номером

	Ожидаемый результат:
	1,2,5,7,10,2,3,2,17,15,2,6,10,119,150
	(первый массив - 1,2,5,7,10), (второй массив - 2,3,2,17,15),
	(результат перемножения - (1*2), (2*3), (5*2), (7*17), (10*15)
 */
public class Task3Advanced {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 5, 7, 10};
        int[] array2 = {2, 3, 2, 17, 15};

        int[] arrayResult = new int[array1.length + array2.length + Math.max(array1.length, array2.length)];
        System.arraycopy(array1, 0, arrayResult, 0, array1.length);
        System.arraycopy(array2, 0, arrayResult, array1.length, array2.length);

        int j = 0;
        for (int i = array1.length + array2.length; i < arrayResult.length; i++){
            arrayResult[i] = array1[j] * array2[j];
            j++;
        }

        for (int k : arrayResult) {
            System.out.print(k + " ");
        }
    }
}
