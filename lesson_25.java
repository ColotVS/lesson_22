public class lesson_25 {
    //Есть public интерфейсы CanFly (летать), CanRun (бежать/ездить), CanSwim (плавать).
    //Добавь эти интерфейсы классам Human (человек), Duck (утка), Penguin (пингвин), Airplane (самолет),
    //и не забудь про реализацию методов интерфейсов (в методах ничего делать не нужно).
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }


    public class Human implements CanRun, CanSwim {
        public void run() {

        }

        public void swim() {

        }

    }

    public class Duck implements CanFly, CanRun, CanSwim {
        public void fly() {

        }

        public void run() {

        }

        public void swim() {

        }

    }

    public class Penguin implements CanRun, CanSwim {

        public void run() {

        }

        public void swim() {

        }

    }

    public class Airplane implements CanFly {
        public void fly() {

        }


    }
}
