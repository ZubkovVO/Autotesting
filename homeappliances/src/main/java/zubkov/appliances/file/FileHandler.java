package zubkov.appliances.file;

import zubkov.appliances.model.HomeAppliance;

import java.io.*;
import java.util.List;

public class FileHandler {

    public static void createFile(String name, List<HomeAppliance> appliances){

        File fout = new File(name);
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(fout);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
        try {
            for (HomeAppliance appliance : appliances){
                bw.write(appliance.getWatt()+"|"+appliance.getSize()+"|"+appliance.getModel());
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
