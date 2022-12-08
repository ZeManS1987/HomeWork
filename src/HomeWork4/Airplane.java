package HomeWork4;

public class Airplane implements Fly{
    int countPassengers = 0;

    public Airplane(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    @Override
    public void fly() throws FlyExeption {
        if(countPassengers >= 0){
            System.out.println("самолет летит");
        }
        else
            throw new FlyExeption("Ошибка: пассажиров меньше нуля");

    }
}
