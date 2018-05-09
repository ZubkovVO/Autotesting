package zubkov.appliances.model;

public class Kettle extends HomeAppliance {
    public Kettle(int watt, String size, String model) {
        super(watt, size, model);
    }
    @Override
    String getType() {

        return this.getClass().getSimpleName();
    }
    @Override
    public void goSleep() {
        throw new UnsupportedOperationException("Чайники не спят");
    }

}
