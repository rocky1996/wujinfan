package bingfa;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2020-12-03
 */
public class AtomicExampleTest {

    public static void main(String[] args) throws Exception{
        CountDownLatch countDownLatch = new CountDownLatch(100);
        AtomicInteger atomicInteger = new AtomicInteger(0);

        for(int i=0;i<100;i++){
           new Thread(){
               @Override
               public void run() {
                   int s = atomicInteger.getAndIncrement();
                   System.out.println(s);
                   countDownLatch.countDown();
               }
           }.start();
        }
        countDownLatch.await();
        System.out.println(atomicInteger.get());
    }

}
