import java.util.ArrayList;

public class Country {
     public final String countryName;
    public final String capitalCity;
    public final ArrayList<String> listOfState=new ArrayList<>();

    public Country(String countryName, String capitalCity) {
        this.countryName = countryName;
        this.capitalCity = capitalCity;
        this.listOfState.add("Province 1");
        this.listOfState.add("Province 2");
    }

    public String getCountryName() {
        return countryName;
    }

    public String getCapitalCity() {
        return capitalCity;
    }

    public ArrayList<String> getListOfState() {
        return listOfState;
    }

    public static void main(String[] args) {
        Country country=new Country("Nepal","Kathmandu");
        System.out.println(country.getCountryName());
        System.out.println(country.getCapitalCity());
        System.out.println(country.getListOfState());
    }
}
