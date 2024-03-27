import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Filereader {
    
    public ArrayList<Building> readFile(String path) throws FileNotFoundException{

        ArrayList<Building> buildingList = new ArrayList<Building>();
        File file = new File(path);
        Scanner sc = new Scanner(file);
        sc.nextLine();
        while(sc.hasNextLine()){

            String line = sc.nextLine();
            String[] lineArray = line.split(",");
            Building building = new Building();
            building.id = Integer.parseInt(lineArray[0]);
            building.city = lineArray[1];
            building.address = lineArray[2];
            building.usage = lineArray[3];
            building.size = Integer.parseInt(lineArray[4]);
            building.price = Double.parseDouble(lineArray[5]);
            buildingList.add(building);
        }
        sc.close();
        return buildingList;
    }
}
