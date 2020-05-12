package com.slxsm.demo.singleton_pattern;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 * 懒汉模式，最初的懒汉模式不是线程安全的，那也就是不能保证单例，如下demo
 * 不安全举例子：
 * @see #getUnsafeSingleton() 如果有两个线程A和B，当A线程到达20行是判断为空还未实例化，当线程B同时请求过来，也是判断为空未实例化，那么就都会new Singleton();实例化
 * 导致产生多例。
 * 往下看
 * @see #getSyncSingleton() 方法虽然加上了同步锁，这样保证了线程安全，
 * 但是效率很低，而且一般是在创建首次需要同步，非首次则不需要，每次都要同步，效率差
 * 往下看
 * @see #getDoubleCheckSingleton() 方法在第一次检查空时，如果为空，则继续往下，加锁，sync是排它锁，所以只有一个线程进入，
 * 而且singleton静态变量被volatile修饰，也排除掉了重排序问题。
 * 衍生出来的是加锁
 * @author slxsm
 * @date 2020-03-14
 */
public class LazyManSingleton {

    private LazyManSingleton(){};

    public static LazyManSingleton singleton;

    public static LazyManSingleton getUnsafeSingleton(){
        if (singleton == null){
            singleton = new LazyManSingleton();
        }
        return singleton;
    }

    public static synchronized LazyManSingleton getSyncSingleton(){
        if (singleton == null){
            singleton = new LazyManSingleton();
        }
        return singleton;
    }

    private static volatile LazyManSingleton doubleCheckSingleton;

    public static LazyManSingleton getDoubleCheckSingleton(){
        if (doubleCheckSingleton == null) {
            synchronized (doubleCheckSingleton){
                if (doubleCheckSingleton == null){
                    doubleCheckSingleton = new LazyManSingleton();
                }
            }
        }
        return doubleCheckSingleton;
    }

}
