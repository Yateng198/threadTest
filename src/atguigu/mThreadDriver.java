package atguigu;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class
mThreadDriver {
    public static void main(String[] args) {
        mThread mt = new mThread();
        Thread td = new Thread(mt);
        Thread t22 = new Thread();

        td.start();

    }
}
