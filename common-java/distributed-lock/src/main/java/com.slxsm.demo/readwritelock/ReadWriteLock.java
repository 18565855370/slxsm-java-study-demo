package com.slxsm.demo.readwritelock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
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
public class ReadWriteLock {

    static ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock(false);
    private static final Lock readLock = readWriteLock.readLock();
    private static final Lock writeLock = readWriteLock.writeLock();
    private static final List<String> data = new ArrayList<>();

    public static void main(String[] args) {
        new Thread(ReadWriteLock::write).start();
        new Thread(ReadWriteLock::read).start();
        new Thread(ReadWriteLock::read).start();
    }


    private static void write(){
        try {
            writeLock.lock();
            data.add("写数据");
            System.out.println(Thread.currentThread().getName() + " : " + "写数据");
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            writeLock.unlock();
        }
    }

    private static void read(){
        try{
            readLock.lock();
            for (String string : data){
                System.out.println(Thread.currentThread().getName() + " : 读数据  value ：" + string);
            }
            TimeUnit.SECONDS.sleep(3);
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            readLock.lock();
        }
    }

}
