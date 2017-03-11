package basic.collection;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
/*7- we have list name of countries , convert all list into map by grouping key as first letter of country with value of list of countries with the same first letter.  
 * For instance : Country names Australia, Afghanistan , it will be stored in map key "A" , values ["Australia","Afghanistan"]

 */
public class ExcerciseJavaCollection7 {
	public static void main(String[] args) {
		
		Set<String> setCountries = new HashSet<>();
		List<String> countries = (List<String>) CountriesList.getAllCountries();
		
		for(String item:countries){
			setCountries.add(item);
		}
		//System.out.println(setCountries);
		
		Set<String> setUniqeFirstLetterCountries = new HashSet<>();
		for(String item1:countries){
			String data = item1;
	        String value = data.substring(0, 1).toUpperCase();//first letter
			setUniqeFirstLetterCountries.add(value);
		}
		//System.out.println(setUniqeFirstLetterCountries);				
		
		Map<String, Set<String> > tmapCoun2 = new TreeMap<>();//TreeMap
		for(String item:setUniqeFirstLetterCountries){
			Set<String> groupByCountry = new HashSet<>();
			groupByCountry = getCountriesByFirstLetter(item, setCountries);
			tmapCoun2.put(item, groupByCountry);
		}
		System.out.println(tmapCoun2);		
    }
	//method
	public static Set<String> getCountriesByFirstLetter(String country, Set<String> countries){		
		Set<String> setCountriesWithTheSameKey = new HashSet<String>();
		for(String item:countries){
			String firstLetter = item.substring(0, 1).toUpperCase();
			if(firstLetter.equals(country)){
				setCountriesWithTheSameKey.add(item);				
			}
		}
		return setCountriesWithTheSameKey;
	}	
	//end method
}
