package org.example.task1;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

import static java.util.concurrent.TimeUnit.*;

class HowLongProgramWork {
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);

    public void howLongWorkProgram() {
        final Runnable second = new Runnable() {
            int i = 0;
            public void run() {
                System.out.println(i);
                i++;
            }
        };
        final Runnable fiveSeconds = new Runnable() {
            int i = 0;

            public void run() {
                System.out.println("Минуло 5 секунд");
                i++;
            }
        };

        final ScheduledFuture<?> seconds = scheduler.scheduleAtFixedRate(second, 0, 1, SECONDS);
        final ScheduledFuture<?> fiveSecondsLeft = scheduler.scheduleAtFixedRate(fiveSeconds, 5, 5, SECONDS);
        scheduler.schedule(() -> {
            seconds.cancel(true);
            fiveSecondsLeft.cancel(true);
        }, 60 * 60, SECONDS);
    }
}