package chapter1;

public class student extends person {
    //variables
    String stdID ;
    //const
    student(){
        stdID = "C112160";
    }
    student(String name , int age , String stdID){
        //call parent constructor
        super(name , age);
        this.stdID = stdID;
    }



    //method
    void display(){   //overriding
        System.out.println("Student ID: " + stdID);
        super.display();
    }
}
