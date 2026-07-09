package day9;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class Car implements Runnable {

    private static int CARS_COUNT = 0;
    private static String WINNER = null;

    private Race race;
    private int speed;
    private String name;

    private static CountDownLatch startLatch;
    private static CountDownLatch finishLatch;
    private static CyclicBarrier startBarrier;

    public static void initLatches(int count) {
        startLatch = new CountDownLatch(count);
        finishLatch = new CountDownLatch(count);
        startBarrier = new CyclicBarrier(count);
    }

    public Car(Race race, int speed) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public static String getWinner() {
        return WINNER;
    }

    @Override
    public void run() {
        try {
            // подготовка
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int) (Math.random() * 800));
            System.out.println(this.name + " готов");

            // ждём всех на старте
            startBarrier.await();

            // гонка
            for (int i = 0; i < race.getStages().size(); i++) {
                race.getStages().get(i).go(this);
            }

            // финиш
            synchronized (Car.class) {
                if (WINNER == null) {
                    WINNER = this.name;
                    System.out.println(this.name + " - WIN");
                }
            }

            finishLatch.countDown();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void awaitStart() throws InterruptedException {
        if (startLatch != null) {
            startLatch.await();
        }
    }

    public static void awaitFinish() throws InterruptedException {
        if (finishLatch != null) {
            finishLatch.await();
        }
    }
}