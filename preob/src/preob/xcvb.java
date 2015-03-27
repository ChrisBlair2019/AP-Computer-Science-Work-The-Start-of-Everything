package preob;

import java.util.ArrayList;
import java.util.List;

public class xcvb {
	
	public static void main(String[] args) {

List<String> cities = new ArrayList<String>();
cities.add("Atlanta");
cities.add("Boston");
cities.add("Chicago");
for(String city : cities)
	city = city.substring(1);
System.out.println(cities);

	}

}


