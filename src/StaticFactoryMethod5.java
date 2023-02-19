public abstract class StaticFactoryMethod5 {

    public abstract void getName();

    public static StaticFactoryMethod5 getNewInstance() {
        StaticFactoryMethod5 temp = null;

        try {
            Class<?> childClass = Class.forName("StaticFactoryMethod5Child");
            temp = (StaticFactoryMethod5) childClass.newInstance();
        } catch (ClassNotFoundException e) {
            System.out.println("클래스가 없습니다.");
        } catch (InstantiationException  e) {
            System.out.println("메모리에 올릴수 없습니다.");
        } catch (IllegalAccessException  e) {
            System.out.println("클래스파일 접근 오류입니다.");
        }

        return temp;
    }
}
