public class lesson_34 {
    //Добавь как можно больше интерфейсов к классу Human, но так, чтобы он не стал абстрактным классом.
    //Добавлять методы в класс Human запрещается.
    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human);
    }

    public interface Worker {
        void workLazy();
    }

    public interface Businessman {
        void workHard();
    }

    public interface Secretary {
        void workLazy();
    }

    public interface Miner {
        void workVeryHard();
    }

    public static class Human implements Worker, Businessman, Secretary {

        public void workHard() {
        }

        public void workLazy() {
        }
    }
}
