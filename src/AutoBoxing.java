public class AutoBoxing {
    public static void main(String[] args) {
        long beforeTime = System.currentTimeMillis();

        // 1. auto-boxing 사용 O
        Long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println("auto-boxing 했을 때 소요시간(s) : " + (System.currentTimeMillis() - beforeTime) / 1000.0);

        // 2. auto-boxing 사용 X
        beforeTime = System.currentTimeMillis();
        long sum2 = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            sum2 += i;
        }
        System.out.println("auto-boxing 안 했을 때 소요시간(s) : " + (System.currentTimeMillis() - beforeTime) / 1000.0);
    }
}