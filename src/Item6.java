public class Item6 {

    private static int[] cachingArray = new int[500000];

    public static void main(String[] args) {
        long beforeTime = System.currentTimeMillis();

        // 1. 캐싱을 했을 때
        for (int i = 0; i < 200000; i++) {
            cachingArray[i] = 1;
        }
        System.out.println("캐싱 했을 때 소요시간(s) : " + (System.currentTimeMillis() - beforeTime) / 1000);

        // 2. 캐싱을 하지 않았을 때
        beforeTime = System.currentTimeMillis();

        for (int i = 0; i < 200000; i++) {
            int[] nonCachingArray = new int[500000];
            nonCachingArray[i] = 1;
        }
        System.out.println("캐싱 안 했을 때 소요시간(s) : " + (System.currentTimeMillis() - beforeTime) / 1000);
    }
}