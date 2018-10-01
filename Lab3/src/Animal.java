public class Animal {
    private String name;
    private String voice;
    private String habitat;

    public Animal(){
        name = "Dog";
        voice = "Wuff";
        habitat = "Human environment";
    }

    public Animal(String uname, String uvoice, String uspecies, String uhabitat){
        name = uname;
        voice = uvoice;
        habitat = uhabitat;
    }

    public String getVoice(){
        return voice;
    }

    public String getHabitat(){
        return habitat;
    }

    public void setVoice(String uvoice){
        voice = uvoice;
    }

    public void setHabitat(String uhabitat){ habitat = uhabitat; }
}
