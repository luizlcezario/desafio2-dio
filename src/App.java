import singletons.SingletonEager;
import singletons.SingletonLazy;
import singletons.SingletonLazyHolder;

public class App {
    public static void main(String[] args) throws Exception {
        SingletonLazy lazy = SingletonLazy.getInstance();
        SingletonLazy lazy2 = SingletonLazy.getInstance();
        SingletonEager eager = SingletonEager.getInstance();
        SingletonEager eager2 = SingletonEager.getInstance();
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        SingletonLazyHolder lazyHolder2 = SingletonLazyHolder.getInstance();
        try {
            assert lazy == lazy2;
            System.out.println("SingletonLazy works!");
        } catch (AssertionError e) {
            System.out.println("SingletonLazy doesn't work!");
        }
        try {
            assert eager == eager2;
            System.out.println("SingletonEager works!");
        } catch (AssertionError e) {
            System.out.println("SingletonEager doesn't work!");
        }
        try {
            assert lazyHolder == lazyHolder2;
            System.out.println("SingletonLazyHolder works!");
        } catch (AssertionError e) {
            System.out.println("SingletonLazyHolder doesn't work!");
        }
    }
}
