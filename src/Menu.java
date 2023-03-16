import java.util.function.Function;

public enum Menu {

    COFFEE("커피", money -> money * 2),
    CAKE("케이크", money -> money),
    TEA("차", money -> money * 3);

    private final String name;
    private final Function<Integer, Integer> op;

    Menu(String name, Function<Integer, Integer> op) {
        this.name = name;
        this.op = op;
    }

    public int price(int money) {
        return op.apply(money);
    }

    public String getName() {
        return name;
    }
}
