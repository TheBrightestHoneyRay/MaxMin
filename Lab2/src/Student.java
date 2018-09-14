public class Student {

    private String name = "Balnur";
    private int ID = 1;
    private static int yearsOfStudy = 0;

    Student(){}

    Student(String newName, int newID){
        name = newName;
        ID = newID;
    }

    public String getName(){
        return name;
    }

    public int getID(){
        return ID;
    }

    public void increment(){
        yearsOfStudy++;
    }

    public int getYearsOfStudy(){
        return yearsOfStudy;
    }


}
