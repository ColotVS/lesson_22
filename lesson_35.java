public class lesson_35 {
    //Добавь такой класс-родитель к классу CTO (технический директор), чтобы класс перестал быть абстрактным.
    //Добавлять/реализовывать методы в классе CTO запрещается.
    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static interface Businessman {
        public void workHard();
    }

    public static class Business implements Businessman {
        @Override
        public void workHard() {
            System.out.println("i am businassman");
        }
    }

    public static class CTO extends Business implements Businessman {

    }
}
