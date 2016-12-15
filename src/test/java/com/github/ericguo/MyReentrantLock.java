package com.github.ericguo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by eric567 [email:gyc567@126.com]
 * on 12/14/2016.
 */
public class MyReentrantLock extends Thread{
    TestReentrantLock lock;
    private int id;
    public MyReentrantLock(int i,TestReentrantLock test){
        this.id=i;
        this.lock=test;
    }

    public void run(){
        lock.print(id);
    }

    public static void main(String args[]){
        ExecutorService service= Executors.newCachedThreadPool();
        TestReentrantLock lock=new TestReentrantLock();
        for(int i=0;i<10;i++){
            service.submit(new MyReentrantLock(i,lock));
        }
        service.shutdown();
    }
}
class TestReentrantLock{
    private ReentrantLock lock=new ReentrantLock();
    public void print(int str){
        try{
            lock.lock();
            System.out.println(str+"get the lock.");
            Thread.sleep((int)(Math.random()*1000));
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            System.out.println(str+"release the lock");
            lock.unlock();
        }
    }
}
