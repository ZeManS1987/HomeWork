package HomeWork4;

public class Duck implements Fly {
    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    public  boolean isInjured;

    public Duck() {
    }

    @Override
    public void fly() throws FlyExeption {
        if (isInjured == false) {
            System.out.println("утка летит");
        }
        else
            throw new FlyExeption("Ошибка: Утка ранена");


    }
}
