package com.github.ericguo;

import org.junit.Test;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by eric567 [email:gyc567@126.com]
 * on 11/29/2016.
 */

class TestTimerTask extends TimerTask {

    @Override

    public void run() {

        System.out.println("TestTimerTask is running......");

    }

}

public class TimerTaskTest {

    @Test

    public void testTimerTask() {

        Timer timer = new Timer();

        timer.schedule(new TestTimerTask(), 0, 10);

    }

}