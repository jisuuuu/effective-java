import java.util.stream.Stream;

public class Item47 {

    public static void main(String[] args) {
        Stream<String> fruits = Stream.of("바나나", "딸기", "메론", "오렌지");

        for (String fruit : iterableOf(fruits)) {
            System.out.println("fruit = " + fruit);
        }
    }

    public static <E> Iterable<E> iterableOf(Stream<E> stream) {
        return stream::iterator;
    }
}
