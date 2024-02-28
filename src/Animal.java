public class Animal {
    public void greeting()
    {
        System.out.println("Animal Incoming!");
    }

    public void animalSound(){
        System.out.println("The animal makes a sound");
    }
    private String name;

    // Getter
    public String getName(){
        return name;
    }

    // Setter
    public void setName(String newName){
        this.name = newName;
    }
}