package zubkov.appliances.model;

public class Oven extends HomeAppliance {
    public Oven(int watt, String size, String model) {
        super(watt, size, model);
    }

    @Override
    String getType() {
        return this.getClass().getSimpleName();
    }

    @Override
    public void goSleep() {
        System.out.println("zzzzz");
    }

}
