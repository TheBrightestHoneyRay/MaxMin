public class Dog extends Animal {

    private String owner;
    private String nickname;
    static int amount;

    public Dog(){
        super();
        nickname = "Mr' smith";
        owner = null;
        amount++;
    }

    public Dog(String unickname){
        super();
        nickname = unickname;
        amount++;
    }

    public String getNickname(){
        return nickname;
    }

    public void setName(String unickname){
        nickname = unickname;
    }
}
