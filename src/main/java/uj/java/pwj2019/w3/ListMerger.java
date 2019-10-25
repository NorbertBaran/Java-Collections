package uj.java.pwj2019.w3;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListMerger {
    public static List<Object> mergeLists(List<?> l1, List<?> l2) {
        return IntStream.range(0, Math.min(l1.size(), l2.size()))
                .boxed()
                .collect(Collectors.toMap(l1::get, l2::get))
                .entrySet()
                .stream()
                .map(x -> List.of(x.getKey(), x.getValue()))
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }

}
