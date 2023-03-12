import java.util.HashSet;
import java.util.Set;

public class ShoppingBasket {

    public static void main(String[] args) {
        // 과자의 타입마다 분리하기 위해 Set 배열을 만들고, 초기 사이즈를 과자의 총 타입의 갯수로 지정한다.
        Set<Snack>[] snacksByType = (Set<Snack>[]) new Set[Snack.Type.values().length];

        //초기화
        for (int i = 0; i < snacksByType.length; i++) {
            snacksByType[i] = new HashSet<>();
        }

        // 장바구니에 과자를 담는다.
        Snack[] shoppingBasket = {
                new Snack("초코파이", Snack.Type.BOX),
                new Snack("양파링", Snack.Type.BAG),
                new Snack("바나나킥", Snack.Type.BAG),
                new Snack("후레치파이", Snack.Type.BOX),
                new Snack("새우깡", Snack.Type.BAG)
        };

        // 장바구니에 담은 과자들을 타입별로 분리한다.
        for (Snack snack : shoppingBasket) {
            snacksByType[snack.type.ordinal()].add(snack); // 이 때, ordinal()을 사용한다. (BOX = 0, BAG = 1)
        }

        // 결과를 출력한다.
        for (int i = 0; i < snacksByType.length; i++) {
            System.out.printf("%s: %s%n", Snack.Type.values()[i], snacksByType[i]);
        }
    }
}
