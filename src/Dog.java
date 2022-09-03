public class Dog extends Animal{
    private String command;

    public Dog(String name, String breed, int age, Color color,String command) {
        super(name, breed, age, color);
        this.command =command;
    }

    public String getCommand() {
        return command;
    }

    public void play(){
        System.out.println(getName() + " Play with ball");
    }

    @Override
    public String showData() {
        return super.showData() +
                "\nCommand: " + command;
    }
}
