package day9;

public class Main {

    public static final int CARS_COUNT = 4;

    public static void main(String[] args) throws InterruptedException {

        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");

        // инициализация
        Car.initLatches(CARS_COUNT);

        Race race = new Race(
                new Road(60),
                new Tunnel(),
                new Road(40)
        );

        Car[] cars = new Car[CARS_COUNT];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10));
        }

        // запускаем
        for (Car car : cars) {
            new Thread(car).start();
        }

        // ждём пока все подготовятся
        Car.awaitStart();

        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");

        // ждём финиша всех
        Car.awaitFinish();

        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
        System.out.println("Победитель: " + Car.getWinner());
    }
}