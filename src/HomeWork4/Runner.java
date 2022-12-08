package HomeWork4;

public class Runner {
    public static void main(String[] args) throws FlyExeption {
        Duck duck = new Duck(true);
        Duck duck1 = new Duck(false);
        Airplane airplane = new Airplane(10);
        Airplane airplane1 = new Airplane(-1);

        Fly[] fly = {duck, duck1, airplane, airplane1};
         for (Fly flyes : fly) {
             try {   flyes.fly();
               }
               catch (FlyExeption e){
                   System.out.println(e.getMessage());
               }

            }


    }
}
