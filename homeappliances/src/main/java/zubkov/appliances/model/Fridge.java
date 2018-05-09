package zubkov.appliances.model;

public class Fridge extends HomeAppliance {
    public Fridge(int watt, String size, String model) {
        super(watt, size, model);
    }
    @Override
    String getType() {
        return this.getClass().getSimpleName();
    }
}
