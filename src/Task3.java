/*
    Создать строку из массива букв a,b,c,d,e,
    вывести на экран,
    поменять в массиве 4 букву по счету на h,
    и снова создать строку, вывести на экран
 */
public class Task3 {
    public static void main(String[] args) {
        char[] givenArray = {'a', 'b', 'c', 'd', 'e'};

        System.out.println(new String(givenArray));

        givenArray[3] = 'h';

        System.out.println(new String(givenArray));
    }
}
