public abstract class AbstractPhone implements Phone {

    @Override
    public void booting() {
        System.out.println("booting ...");
    }

    @Override
    public void shutdown() {
        System.out.println("shut down ...");
    }

    @Override
    public void process() {
        booting();
        greeting();
        shutdown();
    }
}
