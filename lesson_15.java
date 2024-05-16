public class lesson_15 {
    //Сделай класс Pet абстрактным.
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.getInfo();
    }
    public static class Cat extends Pet{

        @Override
        public void getName() {
            System.out.println("Я - кошка");
        }
    }

    public static abstract class Pet {
        public abstract void getName();

        public void getStatus(){
            System.out.println("Я - животное");
        }

        public void getInfo(){
            getName();
            getStatus();
        }

    }
}
