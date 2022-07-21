/*
Узнать, есть ли в lists хотя бы один список,
который содержит сумму всех элементов вложенного листа
равную 12
 */
package Module2.Homework2;

import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<List<Integer>> lists = List.of(List.of(1, 2), List.of(3, 4, 5), List.of(1, 3));

        boolean result = lists.stream()
                .anyMatch(e -> e.stream().reduce(Integer::sum).orElse(0) == 12);

        System.out.println(result);
    }
}
