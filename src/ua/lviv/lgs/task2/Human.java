package ua.lviv.lgs.task2;

public class Human {
    int age;
    int weight;
    int height;
    String name;
    Human(int age){
        this.age = age;
    }
    Human(int age, int weight){
        this(age);
        this.weight = weight;
    }
    Human(int age, int weight, int height){
        this(age, weight);
        this.height = height;
    }
    Human(int age, int weight, int height, String name){
        this(age,weight,height);
        this.name = name;

    }

}
