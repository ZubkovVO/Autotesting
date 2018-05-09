package zubkov.appliances;

import zubkov.appliances.model.Fridge;
import zubkov.appliances.model.HomeAppliance;
import zubkov.appliances.model.Kettle;
import zubkov.appliances.model.Oven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Apartment apartment = new Apartment();
        HomeAppliance oven = new Oven(1000, "medium","Bosh6572");
        HomeAppliance oven1 = new Oven(5000, "large","BoshXL");
        HomeAppliance fridge = new Fridge(600, "large","AristonCool231");
        HomeAppliance kettle = new Kettle(400, "small","Bosh1001");
        apartment.addAppl(oven);
        apartment.addAppl(oven1);
        apartment.addAppl(fridge);
        apartment.addAppl(kettle);
        apartment.applList();
        System.out.println();
        apartment.sortAppl();
        apartment.applList();
        System.out.println();
        System.out.println("Кол-во Watt до включения: " + apartment.wattCount());
        oven.plugIn();
        System.out.println("Кол-во Watt после включения: " + apartment.wattCount());
        System.out.println();
        apartment.searchBySize("large");
    }
}
