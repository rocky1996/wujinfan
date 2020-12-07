package bingfa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

import java.util.List;

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

        List<String> a = new ArrayList<>();
        a.add("aaa");
        a.add("bbb");
        a.add("ccc");
        System.out.println("Before iterator:"+a);
        Iterator<String> it = a.iterator();
        while(it.hasNext()){
            String s = it.next();
            if("bbb".equals(s)){
                it.remove();
            }
        }

        System.out.println("After iterator:"+a);


//        List<String> a = new ArrayList<>();
//        a.add("aaa");
//        a.add("bbb");
//        a.add("ccc");
//        System.out.println("Before iterator:"+a);
//        ListIterator<String> it = a.listIterator();
//        while(it.hasNext()){
//            System.out.println(it.next()+","+it.previousIndex()+","+it.nextIndex());
//        }
//
//        while(it.hasPrevious()){
//            System.out.println(it.previous()+" ");
//        }
//        System.out.println();
//
//        it = a.listIterator(1);
//        while(it.hasNext()){
//            String s = it.next();
//            System.out.println(s);
//            if("ccc".equals(s)){
//                it.set("nnn");
//            }else {
//                it.add("kkk");
//            }
//        }
//        System.out.println("After iterator:"+a);
//
//
//        //异步续命
//
//
//        for(int i=0;i<100;i++){
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//
//                }
//            }).start();
//        }
    }

}
