public class Snack {

    enum Type {
        BOX,
        BAG,
        BARREL
    }

    final String name;
    final Type type;

    Snack(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "name='" + name + '\'' +
                '}';
    }
}
