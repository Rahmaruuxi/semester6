package assignment;

public class jamhuriya {
    private String name;

    jamhuriya(){
        this("rahma abdirahman");
        System.out.println("jamhuriya with out argument");
    }
    jamhuriya(String name){
        this.name= name;
        System.out.println("jamhuriya with argument");


    }

    void displayfor(){
        System.out.println("name:"+name);
    }
}
