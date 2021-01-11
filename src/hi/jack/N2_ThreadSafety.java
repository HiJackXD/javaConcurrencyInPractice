package hi.jack;

public class N2_ThreadSafety{
    /**
    2.1什么是线程安全性：当多个线程访问某个类时，这个类始终都能表现出正确的行为。
    2.2原子性
       ++count不是原子性的，实际上分为三步：读取count值-修改加1-结果写入count（读取-修改-写入）
       2.2.1 静态条件
        不恰当的执行时序而出现的不正确结果的情况。
       2.2.2 静态单例的竞态条件
       2.2.3 复合操作
r    2.3 加锁机制
        仅仅用atomic类作为状态变量，还是不够的。atomic只能直线自身操作的原子性，不能实现业务中操作多个状态便量的原子性。
        即，要实现线程安全，要在单个原子操作中完成所以状态变量的更新。
        2.3.1 内置锁:synchronized block
            synchronized修饰方法时，锁是调用该方法的对象（若是静态方法，锁则是Class对象）
        3.3.2 重入
            获取锁的操作粒度是"线程"，而不是调用。重入的一种实现是，为每个锁关联一个获取计数值和所有者线程。进入锁代码块，
            计数值+1，退出锁代码块则-1.
            这样，在同步方法1中调用同步方法2，由于都是2个方法都将获取锁，若没有重入，则方法1调用方法2时产生死锁。
    2.4 用锁来保护状态
            每个共享可变的变量都应该只由1个锁来保护。
            一种常见的加锁约定是，将所有可变状态封装在对象内部，由内置锁对所有代码路径进行同步（如Vector）。缺点时，后续扩展时，新加的代码仍然要注意对相关代码路径进行同步。
    2.5 活跃性与性能

    参考
    @see net.jcip.examples.SynchronizedFactorizer
    @see net.jcip.examples.CachedFactorizer
     */


}
