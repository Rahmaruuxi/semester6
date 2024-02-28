package chapter1;

public class person {
    private String name;
    private  int age;
    //constructors
   person(){
       this("rahma abdirahman" , 70);
   }
    person(String name , int age){
        this.name =  name ;
        this.age  =  age ;
    }


    //methods
    void display(){
        System.out.println("Name: " + name );
        System.out.println("Age: " + age );
    }

}
