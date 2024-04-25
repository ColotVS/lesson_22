public class lesson_08 {
    //Перегрузка методов

    //Перегрузка – это очень простая операция.
    //На самом деле – это даже не операция над методами, хотя иногда ее называют страшным словом – параметрический полиморфизм.

    //Дело в том, что все методы внутри класса должны иметь уникальные имена.

    //Так вот, это не совсем так. Вернее совсем не так. Метод не должен иметь уникальное имя.
    //Уникальным должно быть объединение из имени и типов параметров этого метода. Их еще называют сигнатурами методов.

    //public void print();
    //public void print2();
    //Так можно. Два метода имеют уникальные имена.

    //public void print();
    //public void print(int n);
    //И так можно. Два метода имеют уникальные имена (сигнатуры).

    //public void print(int n, int n2);
    //public void print(int n);
    //Все еще уникальные методы.

    //public int print(int a);
    //public void print(int n);
    //А так нельзя. Методы не уникальные, хоть и возвращают разные типы.

    //public int print(int a, long b);
    //public long print(long b, int a);
    //А так – можно. Параметры методов уникальные.

    //Имена параметров роли не играют – они теряются при компиляции.
    //После компиляции о методе известно только его имя и типы параметров.
}