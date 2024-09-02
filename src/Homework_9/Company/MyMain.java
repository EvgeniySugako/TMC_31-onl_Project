package Homework_9.Company;/*
Задача 1:
Создать классы "Директор", "Рабочий", "Бухгалтер". Реализовать интерфейс с методом, который печатает название должности
и имплементировать этот метод в созданные классы.
Задача *:
Самостоятельно изучить и показать пример работы интерфейса-маркера Cloneable.
 */

public class MyMain {
    public static void main(String[] args) {
        getPosition(createPosition());
    }

    public static Position[] createPosition(){
        return new Position [] { // anonymous - no name included
                new Director (
                        "Petr",
                        "Tasks director"),
                new Accountant (
                        "Irina",
                        "Tasks accountant"),
                new Worker (
                        "Ivan",
                        "Tasks workers")
        };
    }

    public static void getPosition(Position[] position){
        for(Position post : position){
            System.out.println(post);
            post.appointTask("General tasks...");
        }
        System.out.println();
    }
}
