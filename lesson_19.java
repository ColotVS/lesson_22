public class lesson_19 {
    //Унаследуй классы Cat и Dog от Pet.
    //Реализуй недостающие методы. Классы Cat и Dog не должны быть абстрактными.
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet {
        @Override
        public String getName() {
            return "Дичь";
        }

        @Override
        public Cat getChild() {
            return new Cat();
        }

    }

    public static class Dog extends Pet {
        @Override
        public String getName() {
            return "Барбос";
        }

        @Override
        public Dog getChild() {
            return new Dog();
        }
    }
}
