public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Barsik","Pudel",4,Color.BLACK,"Sit!");



        Record record = new Record(4,2);
        FightingDog dog2 = new FightingDog("King"," Bulldog",5,Color.GREY,"Bite!(Фас!)",
                6,record);



        Record record1 = new Record(10,3);
        FightingDog dog3 = new FightingDog("Rokki","Alabay",
                8,Color.WHITE,"Fight",13,record1);


        System.out.println(dog1.showData());
        dog1.play();
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println(dog2.showData());
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println(dog3.showData());


    }
}