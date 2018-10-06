public class Person {

    private String name;

    public Person(){
        name = "no name";
    }

    public Person(String uname){
        name = uname;
    }

    public void setName(String uname){
        name = uname;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return name;
    }

    public boolean equals(Object object){
        if(object == this || object instanceof Person)
            return true;

        return false;
    }
}
