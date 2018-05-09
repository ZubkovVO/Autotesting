package zubkov.appliances.model;

import zubkov.appliances.Pluggable;
import zubkov.appliances.exceptions.PlugException;

import java.util.Objects;

public abstract class HomeAppliance implements Pluggable, Comparable<HomeAppliance> {

    private int watt;
    private String size;
    private String model;
    private boolean pluggedIn = false;

    HomeAppliance(int watt, String size, String model) {
        this.watt = watt;
        this.size = size;
        this.model = model;
    }

    public int getWatt() {
        return watt;
    }

    public void setWatt(int watt) {
        if (watt <=0){
            throw new IllegalArgumentException("Мощность должна быть больше 0");
        }
        this.watt = watt;
    }


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isPluggedIn() {
        return pluggedIn;
    }

    @Override
    public String toString() {
        return "HomeAppliance{" +
                "type=" + getType() +
                ", watt=" + watt +
                ", size='" + size + '\'' +
                ", model='" + model + '\'' +
                ", pluggedIn=" + pluggedIn +
                '}';
    }

    abstract String getType();

    @Override
    public int compareTo(HomeAppliance compareAppl) {

        int compareWatt = ((HomeAppliance) compareAppl).getWatt();

        //ASC
        return this.watt - compareWatt;

    }

    @Override
    public void plugIn() throws PlugException {
        if (isPluggedIn()){
            throw new PlugException("Прибор уже включен");
        }
        this.pluggedIn=true;
    }

    @Override
    public void plugOut() throws PlugException {
        if (!isPluggedIn()) {
            throw new PlugException("Прибор уже выключен");
        }
        this.pluggedIn=false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HomeAppliance that = (HomeAppliance) o;
        return watt == that.watt &&
                Objects.equals(size, that.size) &&
                Objects.equals(model, that.model);
    }

    @Override
    public int hashCode() {

        return Objects.hash(watt, size, model);
    }

    public abstract void goSleep();
}
