public class lesson_33 {
    //Есть интерфейсы CanFly (летать), CanSwim (плавать), CanRun (бегать).
    //Добавь эти интерфейсы классам Duck (утка), Penguin (пингвин), Toad (жаба)
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

    public class Duck implements CanFly, CanSwim, CanRun {
        @Override
        public void run() {

        }

        @Override
        public void fly() {

        }

        @Override
        public void swim() {

        }
    }

    public class Penguin implements CanSwim, CanRun {
        @Override
        public void swim() {

        }

        @Override
        public void run() {

        }
    }

    public class Toad implements CanSwim {
        @Override
        public void swim() {

        }
    }
}
