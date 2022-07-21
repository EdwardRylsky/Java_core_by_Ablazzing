/*
List<List<Integer>> lists = List.of(List.of(1, 2), List.of(3, 4, 5), List.of());
1. Отсортировать список lists так, чтобы сначала были самые большие списки по размеру
2. Вывести на экран все элементы
Ожидаемый результат: 3,4,5,1,2
 */

package Module2.Homework2;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<List<Integer>> lists = List.of(List.of(1, 2), List.of(3, 4, 5), List.of());

        lists.stream()
                .sorted(((o1, o2) -> -(o1.size() - o2.size())))
                .flatMap(Collection::stream)
                .collect(Collectors.toList())
                .forEach(e -> System.out.print(e + ", "));
    }
}
