package Homework_9.Task_1.Figures;

public interface Methods {
    void getParameter();

    default void getDefaultMethod(){
        System.out.println("Default message");
    }
}
