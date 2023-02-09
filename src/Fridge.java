public class Fridge extends Electronics{
    private String working;
    private String savesFood;

    public Fridge(int powerConsumption) {
        super(powerConsumption);
    }

    public void working(){
        System.out.println(" Freezes... ");
    }
    public void savesFood(){
        System.out.println(" Saves food ....");
    }

    public String getWorking() {
        return working;
    }

    public void setWorking(String working) {
        this.working = working;
    }

    public String getSavesFood() {
        return savesFood;
    }

    public void setSavesFood(String savesFood) {
        this.savesFood = savesFood;
    }
  public Fridge(){
      super(220);

  }

    public Fridge(int powerConsumption, String working, String savesFood) {
        super(powerConsumption);
        this.working = working;
        this.savesFood = savesFood;
    }

    @Override
    public String toString() {
        return "Fridge: --- " +
                " working - " + working + '\n' +
                " savesFood - " + savesFood + '\n';
    }
}
