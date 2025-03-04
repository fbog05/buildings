import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        if(args.length == 0){
            System.err.println("Hiba! Nem adtál meg paramétert");
            using();
            System.exit(101);
        }
        System.out.println("Folytatás...");
        System.out.println(args[0]);
        Filereader fr = new Filereader();
        ArrayList<Building> buildingList = fr.readFile(args[0]);
        Store store = new Store();
        store.save(buildingList);
    }

    public static void using(){

        System.out.println("\nHasználat: ");
        System.out.println("\tjava App <paraméter>");
    }
}
