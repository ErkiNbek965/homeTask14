public class Electronics {
    private int powerConsumption;

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public Electronics(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void powerConsumption(){
        System.out.println("V");
    }

    @Override
    public String toString() {
        return "Electronics:  " +
                " powerConsumption -- " + powerConsumption +" V ";

    }
}

