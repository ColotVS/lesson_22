public class lesson_24 {
    //Есть public интерфейсы CanFly (летать), CanMove (передвигаться), CanEat (есть).
    //Добавь эти интерфейсы классам Dog (собака), Car (автомобиль), Duck (утка), Airplane (самолет).
    public static void main(String[] args) {

    }

    public interface CanFly {
        void fly();
    }

    public interface CanMove {
        void move();
    }

    public interface CanEat {
        void eat();
    }

    public class Dog implements CanEat, CanMove {
        public void eat() {

        }

        public void move() {

        }
    }

    public class Duck implements CanMove, CanEat, CanFly {
        public void eat() {

        }

        public void move() {

        }

        public void fly() {

        }
    }

    public class Car implements CanMove {
        public void move() {

        }
    }

    public class Airplane implements CanFly, CanMove {
        public void fly() {

        }

        public void move() {

        }
    }
}
