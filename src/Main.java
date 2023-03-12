import java.util.List;

public class Main {
    public static void main(String[] args) {
        Favorites favorites = new Favorites();

        Favorites f = new Favorites();

        f.putFavorite(String.class, "Java");
        f.putFavorite(Integer.class, 0xcafebabe);
        f.putFavorite(Class.class, Favorites.class);

        String favoriteString = f.getFavorite(String.class);
        int favoriteInteger = f.getFavorite(Integer.class);
        Class<?> favoriteClass = f.getFavorite(Class.class);

        System.out.printf("%s %x %s%n", favoriteString, favoriteInteger, favoriteClass.getName());

//        f.putFavorite((Class) Integer.class, "hi");
//        int x = f.getFavorite(Integer.class);

//        f.putFavorite(List<Integer>.class, "hi");
    }
}
