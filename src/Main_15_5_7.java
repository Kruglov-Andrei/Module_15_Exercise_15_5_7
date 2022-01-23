import java.util.stream.Stream;

public class Main_15_5_7 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.iterate(1, integer -> integer + 1);
        boolean match = stream
                .map(String::valueOf) // “1”, “2”, “3”, “4”, “5”
                .distinct() //Возвращает новый стрим с уникальными элементами из предыдущего стрима
                .limit(5) // “1”, “2”, “3”, “4”, “5”
                .noneMatch(str -> str.length() != 1); // true
        System.out.println(match);
    }
    }
