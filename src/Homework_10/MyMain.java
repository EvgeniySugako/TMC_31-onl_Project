package Homework_10;
/*
Задача 1:
Создать класс для описания пользователя системы. Переопределить в классе методы toString,hashcode и equals.
Создать несколько экземпляров класса с одним и тем же значением полей и сравнить с помощью метода equals.
Задача *:
Создать программу для реализации поверхностного и глубокого клонирования объекта класса User.
Пусть на вход программе будет передаваться тип операции клонирования (поверхностное клонирование или глубокое),
а также id юзера для клонирования
 */
public class MyMain {
    public static void main(String[] args) {
        User[] users = new User[] {
                new User("Admin", "Vika"),
                new User("Admin", "Vika"),
                new User("User", "Vika")
        };


//        User user1 = new User("Admin", "Vika");
//        User user2 = new User("Admin", "Vika");
//        User user3 = new User("User", "Vika");

        for (User user: users) {
            System.out.println(user);
            System.out.println("hashCode: " + user.hashCode());
            System.out.println("------------------------");
        }

        System.out.println(users[0].equals(users[1]));
        System.out.println(users[1].equals(users[2]));
    }
}
