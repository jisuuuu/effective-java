import java.util.*;

public class Item42 {
    public static void anonymousClass() {
        ArrayList<String> words = new ArrayList<>(List.of("a", "b", "c"));

        Collections.sort(words, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });
    }

    public static void lambda() {
        ArrayList<String> words = new ArrayList<>(List.of("a", "b", "c"));

        Collections.sort(words, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
    }

    public static void main(String[] args) {
        anonymousClass();
    }
}
