import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Practice1 {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        countries.add("United States");
        countries.add("Brazil");
        countries.add("Russia");
        countries.add("China");
        countries.add("Japan");
        countries.add("Germany");
        countries.add("U.K.");

        System.out.println("List of countries: ");
        for(int i = 0; i < countries.size(); i++){
            System.out.println(countries.get(i));
        }

        System.out.println("\nCountries with their Capitals: ");
        Map<String, String> capitals = new HashMap<>();
        capitals.put(countries.get(0),"Washington, D.C");
        capitals.put(countries.get(1),"Brasilia");
        capitals.put(countries.get(2),"Moscow");
        capitals.put(countries.get(3),"Beijing");
        capitals.put(countries.get(4),"Tokyo");
        capitals.put(countries.get(5),"Berlin");
        capitals.put(countries.get(6),"London");

        for(int i = 0; i < capitals.size(); i++){
            System.out.println(countries.get(i) + " : " + capitals.get(countries.get(i)));
        }

        System.out.println("\nCountries within the U.K.: ");
        Set<String> uk = new HashSet<>();
        uk.add("England");
        uk.add("Scotland");
        uk.add("Wales");
        uk.add("Northern Ireland");

        for(String element: uk){
            System.out.println(element);
        }

        System.out.println();
        File file;
        Scanner scanner = null;
        try{
            file = new File("src/main/java/practice.txt");
            scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String text = scanner.nextLine();
                System.out.print(text);
            }
        }catch (FileNotFoundException exception){
            System.out.println("File could not be found");
            exception.printStackTrace();
        }finally {
            scanner.close();
        }

        String text = "This is a Regex test";
        System.out.println("\nOriginal text: " + text+ "\nRegex used: "+text.replaceAll("i","@").replaceAll("e","#"));
    }
}
