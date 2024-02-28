package assignment;

public class compus extends jamhuriya {
    String compusID ;

    compus(){
        System.out.println("compus with out argument");
    }

    compus(String name, String compusID){
        super(name);
        this.compusID= compusID;
        System.out.println("compus with argument");

    }

    void  displayfor(){
        System.out.println("compusID"+compusID);
        super.displayfor();
    }




}
