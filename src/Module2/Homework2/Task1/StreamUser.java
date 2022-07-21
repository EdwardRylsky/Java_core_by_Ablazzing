package Module2.Homework2.Task1;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamUser {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1,2,3,4,5,5,8,8,9);
//        List<Integer> integers = List.of();

        // 100% функциональность
        Random random = new Random(1);
        int result = integers.stream()
                .filter(e -> e > 4)
                .distinct()
                .map(e -> new User(e, Stream.generate(() -> random.nextInt(10)).limit(e).collect(Collectors.toList())))
                .flatMap(e -> e.getIntegerList().stream())
                .map(e -> 10 * e)
                .reduce(Integer::sum)
                .orElse(0);

        System.out.println(result);

        //полуфункциональность
        Random random1 = new Random(1);
        int result1 = integers.stream()
                .filter(e -> e > 4)
                .distinct()
                .map(User::new)
                .peek(e -> {
                    List<Integer> tempList = e.getIntegerList();
                    for (int i = 0; i < e.getIndexNumber(); i++) {
                        tempList.add(random1.nextInt(10));
                    }
                })
                .flatMap(e -> e.getIntegerList().stream())
                .map(e -> 10 * e)
                .reduce(Integer::sum)
                .orElse(0);

        System.out.println(result1);

    }
}
