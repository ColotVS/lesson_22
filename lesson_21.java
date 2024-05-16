public class lesson_21 {
    //Интерфейсы — это поведение

    //Класс – это, чаще всего модель какого-то конкретного объекта.
    //Интерфейс же больше соответствует не объектам, а их способностям или ролям.

    //Например, такие вещи, как машина, велосипед, мотоцикл и колесо лучше всего представить в виде классов и объектов.
    //А такие их способности как «могу ездить», «могу перевозить людей», «могу стоять» — лучше представить в виде интерфейсов.

    //Код на Java	                        Описание
    //interface Moveable {
    //   void move(String newAddress);
    //}                                 	— соответствует способности передвигаться.

    //interface Driveable {
    //    void drive(Driver driver);
    //}	                                    — соответствует способности управляться водителем.

    //interface Transport {
    //    void addStuff(Object stuff);
    //    Object removeStuff();
    //}	                                    — соответствует способности перевозить грузы.

    //class Wheel implements Moveable {
    //    ...
    //}	                                    — класс «колесо». Обладает способностью передвигаться.

    //class Car implements Moveable, Drivable, Transport {
    //    ...
    //}                                 	— класс «машина». Обладает способностью передвигаться, управляться человеком и перевозить грузы.

    //class Skateboard implements Moveable, Driveable {
    //    ...
    //}	                                    — класс «скейтборд». Обладает способностью передвигаться и управляться человеком.


    //Интерфейсы сильно упрощают жизнь программиста.
    //Очень часто в программе тысячи объектов, сотни классов и всего пара десятков интерфейсов – ролей.
    //Ролей мало, а их комбинаций – классов – очень много.

    //Весь смысл в том, что тебе не нужно писать код для взаимодействия со всеми классами.
    //Тебе достаточно взаимодействовать с их ролями (интерфейсами).

    //static interface WallBuilder {
    //    void buildWall();
    //}

    //static class РабочийРобот implements WallBuilder {
    //    public void buildWall() {
    //        …
    //    }
    //}
    //static class РоботСторож implements WallBuilder {
    //    public void buildWall() {
    //       …
    //    }
    //}
    //static class Поливалка {
    //    …
    //}

    //public static void main(String[] args) {
    //    //добавляем всех роботов в список
    //    ArrayList robots = new ArrayList();
    //    robots.add(new РабочийРобот());
    //    robots.add(new РоботСторож());
    //    robots.add(new Поливалка());
    //
    //    //строить стену, если есть такая способность
    //    for (Object robot: robots) {
    //        if (robot instanceof WallBuilder) {
    //            WallBuilder builder = (WallBuilder) robot;
    //            builder.buildWall();
    //        }
    //    }
    //}

    //
}
