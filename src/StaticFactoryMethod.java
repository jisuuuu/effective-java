public abstract class StaticFactoryMethod {

    abstract void getName();

    static public StaticFactoryMethod getNewInstance(String code, String coupon) {
        return new Coupon();
    }

    static public StaticFactoryMethod getNewInstance(String code) {
        return new Point();
    }
}

class Coupon extends StaticFactoryMethod {
    public void getName() {
        System.out.println("쿠폰을 발행합니다!");
    }
}

class Point extends StaticFactoryMethod {
    public void getName() {
        System.out.println("포인트를 적립합니다!");
    }
}
