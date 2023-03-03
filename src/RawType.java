import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RawType {

    public static void main(String[] args) {
        List onlyString = new ArrayList();
        onlyString.add("문자열1");
        onlyString.add("문자열2");
        onlyString.add(13579);

        for (Iterator i = onlyString.iterator(); i.hasNext(); ) {
            String s = (String) i.next(); // ClassCastException 을 던진다.
        }
    }
}
