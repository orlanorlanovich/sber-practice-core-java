package day9;

import java.util.concurrent.Semaphore;

public class Tunnel extends Stage {

    // максимум половина участников
    private static final Semaphore SEMAPHORE = new Semaphore(2);

    public Tunnel() {
        this.length = 80;
        this.description = "Тоннель " + length + " метров";
    }

    @Override
    public void go(Car c) {
        try {
            System.out.println(c.getName() + " готовится к этапу(ждет): " + description);

            SEMAPHORE.acquire();

            System.out.println(c.getName() + " начал этап: " + description);
            Thread.sleep(length / c.getSpeed() * 1000L);
            System.out.println(c.getName() + " закончил этап: " + description);

            SEMAPHORE.release();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}