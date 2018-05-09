package zubkov.appliances;

import zubkov.appliances.exceptions.NoApplianceFoundException;
import zubkov.appliances.exceptions.OverPowerException;
import zubkov.appliances.exceptions.PlugException;
import zubkov.appliances.model.HomeAppliance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Apartment {

    private static final int POWER_LIMIT=5000;

    private List<HomeAppliance> applianceList = new ArrayList<>();

    public void addAppl(HomeAppliance homeAppliance) {
        applianceList.add(homeAppliance);
    }

    public void clearApartment() {
        if (applianceList.isEmpty()){
            throw new IllegalStateException("Квартира уже пуста, только чайник спит");
        }
        applianceList.clear();
    }

    public void sortAppl() {
        Collections.sort(applianceList);
    }

    public void applList () {

        applList(applianceList);
    }

    /**
     * Метод для вывода на экран элементов коллекции
     * @param list
     */
    public void applList (List<HomeAppliance> list) {
        for (HomeAppliance appliance : list){
            System.out.println(appliance.toString());
        }
    }

    public void searchBySize (String size) throws NoApplianceFoundException {
        List<HomeAppliance> result = new ArrayList<>();
        for (HomeAppliance appliance : applianceList){
            if (appliance.getSize().equals(size)){
                result.add(appliance);
            }
        }
        if (result.isEmpty()){
            throw new NoApplianceFoundException("Приборов не найдено");
        }
        System.out.println("Результат поиска: ");
        applList(result);
    }

    public int wattCount () {
        int sum = 0;
        for (HomeAppliance appliance : applianceList){
             if (appliance.isPluggedIn()){
                 sum = sum + appliance.getWatt();

             }
        }
        return sum;
    }

    public void plugInAppliance(HomeAppliance appliance) throws OverPowerException {
        int wattSum = wattCount()+appliance.getWatt();
        if (wattSum > POWER_LIMIT && !appliance.isPluggedIn()) {
            throw new OverPowerException("Включение еще одного прибора представляет опасность для электросети");
        }
        try {
            appliance.plugIn();
        } catch (PlugException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<HomeAppliance> getApplianceList(){
        return applianceList;
    }
}
