public class Main {
    public static void main(String[] args) {


        Fridge fridge = new Fridge(220,"Meat","dairy");
        System.out.println(fridge);
        fridge.savesFood();
        fridge.working();


        Electronics electronics = new Electronics(220);
        electronics.powerConsumption();
        System.out.println(electronics);
    }
}