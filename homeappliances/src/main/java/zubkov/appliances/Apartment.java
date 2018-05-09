package zubkov.appliances;

import zubkov.appliances.model.HomeAppliance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Apartment {

    private List<HomeAppliance> applianceList = new ArrayList<>();

    public void addAppl(HomeAppliance homeAppliance) {
        applianceList.add(homeAppliance);
    }

    public void clearApartment() {
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

    public void searchBySize (String size) {
        List<HomeAppliance> result = new ArrayList<>();
        for (HomeAppliance appliance : applianceList){
            if (appliance.getSize().equals(size)){
                result.add(appliance);
            }
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
}
