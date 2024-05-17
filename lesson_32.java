public class lesson_32 {
    //Вот что тебе нужно сделать в этой задаче:
    //Внутри класса Solution создай интерфейс public interface CanFly (летать) с методом void fly().
    //Внутри класса Solution создай интерфейс public interface CanClimb (лазить по деревьям) с методом void climb().
    //Внутри класса Solution создай интерфейс public interface CanRun (бегать) с методом void run().
    //Подумай логически, какие именно интерфейсы нужно добавить для каждого класса.
    //Добавь интерфейсы классам Cat (кот), Dog (собака), Tiger (тигр), Duck (Утка).
    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanClimb {
        public void climb();
    }

    public static void main(String[] args) {

    }

    public class Cat implements CanRun, CanClimb {
        public void climb() {
            System.out.println("Лазить");
        }

        public void run() {
            System.out.println("Бегать");
        }
    }

    public class Dog implements CanRun {
        public void run() {
            System.out.println("Бегать");
        }
    }

    public class Tiger extends Cat {
    }

    public class Duck implements CanRun, CanFly {
        @Override
        public void fly() {
            System.out.println("Летает");
        }

        @Override
        public void run() {
            System.out.println("Бегает");
        }
    }
}
