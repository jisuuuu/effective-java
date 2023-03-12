import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ShoppingMap {

    public static void main(String[] args) {
        // 과자의 타입마다 분리하기 위해 EnumMa을 사용한다.
        Map<Snack.Type, Set<Snack>> snacksByType = new EnumMap<>(Snack.Type.class);

        // 초기화를 해준다.
        for (Snack.Type type : Snack.Type.values()) {
            snacksByType.put(type, new HashSet<>());
        }

        //장바구니에 과자를 담는다!
        Snack[] shoppingBasket = {
                new Snack("초코파이", Snack.Type.BOX),
                new Snack("양파링", Snack.Type.BAG),
                new Snack("바나나킥", Snack.Type.BAG),
                new Snack("후레치파이", Snack.Type.BOX),
                new Snack("새우깡", Snack.Type.BAG)
        };

        //장바구니에 담은 과자들을 타입별로 분리한다.
        for (Snack snack : shoppingBasket) {
            snacksByType.get(snack.type).add(snack);
        }

        //결과를 출력한다.
        System.out.println(snacksByType);
    }
}
