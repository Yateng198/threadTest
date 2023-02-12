package atguigu;

import org.junit.Test;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

public class mThread implements Runnable{
 private int tr = 100000;


    @Override
    public void run() {
        Instant t1 = Instant.now();
        for (int i = tr; i >0; i--) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Movie time left" + i);
        }

        Instant t2 = Instant.now();
        long diff = Duration.between(t1, t2).toMillis();
        if(diff < 1000){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();


        }else{
            notify();
        }

//        boolean flag = true;
//        Scanner scanner = new Scanner(System.in);
//        while(flag){
//
//            if(tr > 0){
//                try {
//
//                    Instant t1 = Instant.now();
//                    wait();
//                    System.out.println("Movie time remaining " + tr);
//                    Instant t2 = Instant.now();
//                    long diff = Duration.between(t1, t2).toMillis();
//                    if(diff > 1200){
//                        notify();
//                    }else {
//                        String str = scanner.nextLine();
//                        if(str != null){
//                            flag = false;
//                        }else{
//                            continue;
//
//                        }
//                    }
//
//
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                tr--;
//                continue;
//            }
//        }

    }
}
