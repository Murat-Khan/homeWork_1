final class FightingDog extends Dog{
private int fights;
private Record record;

    public FightingDog(String name, String breed, int age, Color color, String command, int fights,Record record ) {
        super(name, breed, age, color, command);
        this.fights = fights;
        this.record = record;

    }



    public int getFights() {
        return fights;
    }

    public Record getRecord() {
        return record;
    }

    @Override
    public String showData() {
        return super.showData() +
                "\nTotal fights: " + fights +
                "\nWins(Побед): " + record.getWins() +
                "\nDefeat(Порожение): " + record.getDefeat();
    }
}
