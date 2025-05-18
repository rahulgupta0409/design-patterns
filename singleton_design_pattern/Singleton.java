package singleton_design_pattern;

import java.time.LocalDateTime;

public class Singleton {

    //private static instance of the class
    private volatile static Singleton singleton;

    //private constructor to prevent/avoid instantiation
    private Singleton(){
        // no args cons...
    }

    //public static method to provide access to the instance object
    public static Singleton getInstance(){
        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    singleton =  new Singleton();
                }
            }
        }
        return singleton;
    }

    //individual public method of the class
    public void displayMethod(){
        System.out.println("Singleton design pattern...");
        System.out.println("Thread Name: " + Thread.currentThread().getName());
        System.out.println("Time: " + LocalDateTime.now());
    }

}
