package zubkov.appliances.file;

import zubkov.appliances.model.HomeAppliance;
import zubkov.appliances.model.Oven;

import java.io.*;
import java.util.ArrayList;
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
                bw.write(appliance.getWatt()+";"+appliance.getSize()+";"+appliance.getModel());
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<HomeAppliance> readFromFile(String name){
        FileInputStream fstream = null;
        try {
            fstream = new FileInputStream(name);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String strLine;
        List<HomeAppliance> appliances = new ArrayList<>();

        try {
            while ((strLine = br.readLine()) != null)   {
                String[] papems = strLine.split(";");
                appliances.add(new Oven(Integer.valueOf(papems[0]), papems[1], papems[2]));
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return appliances;

    }

}
