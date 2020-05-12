package com.slxsm.demo.readwritelock;

import org.redisson.misc.Hash;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * ***************
 * 三毛菜鸟想进大厂*
 * ***************
 *
 * @author slxsm
 * @date 2020-04-22
 */
public class ReadWriteLock2 {

    static ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock(false);
    private static final Lock readLock = readWriteLock.readLock();
    private static final Lock writeLock = readWriteLock.writeLock();
    private Map<String, String> map = new HashMap<String, String>();

    public static void main(String[] args) {
        ReadWriteLock2 readWriteLock2 = new ReadWriteLock2();
        for (int i = 0; i < 4; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + " ：启动");
                readWriteLock2.writeAndRead();
            }).start();
        }
    }

    private void writeAndRead(){
        //读数据
        readLock.lock();
        String readResult = map.get("a");
        if (readResult == null){
            System.out.println("空数据，需要先写");
            readLock.unlock();
            writeLock.lock();
            map.put("a","slxsm");
            writeLock.unlock();
            System.out.println("写完了数据，写释放锁了");
            //继续读锁
            readLock.lock();
        }
        System.out.println("读取的数据是" + readResult);
        readLock.unlock();
    }
}
