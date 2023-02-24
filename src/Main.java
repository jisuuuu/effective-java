import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        CustomHashSet<String> customHashSet = new CustomHashSet<>(new HashSet());
        List<String> test = Arrays.asList("ㅎ", "ㅋ", "ㅗ");
        customHashSet.addAll(test);

        System.out.println(customHashSet.getAddCount());
    }
}
