package fun;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ExeTwo {

	public static void main(String[] args) {

		Map<Country, Map<State,List<City>>> countries = new HashMap<Country, Map<State,List<City>>>();
		
		Country country = new Country("\n\nIndia ",20202020020.25,544545241);
		Country country1 = new Country("\n\nRussia ",234542020020.25,57845446);
		Country country2 = new Country("\n\nUSA",20202020020.25,576545687);
		
		State state = new State();
		state.setArea(21552112);
		state.setStateName("Karnataka");
		City city111 = new City("Bangalore",true);
		City city112 = new City("Mangalore",false);
		City city113 = new City("Mysore",false);
		City city114 = new City("Bagalkote",true);
		List<City> cities1 = new ArrayList<City>();
		cities1.add(city111);cities1.add(city112);cities1.add(city113);
		cities1.add(city114);
		
		State state1 = new State();
		state1.setArea(21552112);
		state1.setStateName("kerala");
		City city121 = new City("trivandram",true);
		City city122 = new City("coimbatore",false);
		City city123 = new City("trissur",false);
		City city124 = new City("cochin",true);
		List<City> cities2 = new ArrayList<City>();
		cities2.add(city121);cities2.add(city122);cities2.add(city123);
		cities2.add(city124);
				
		Map<State, List<City>> one = new HashMap<>();
		one.put(state, cities1);
		one.put(state1, cities2);		
				
				//this is for china
		State state2 = new State();
		state2.setArea(21542112);
		state2.setStateName("Chungdu");
		City city211 = new City("Beijing",true);
		City city212 = new City("Madosso",false);
		City city213 = new City("shiznsis",false);
		City city214 = new City("sbwoker",true);
		List<City> cities3 = new ArrayList<City>();
		cities3.add(city211);cities3.add(city212);cities3.add(city213);
		cities3.add(city214);
		
		State state3 = new State();
		state3.setArea(32568595);
		state3.setStateName("Shangai");
		City city221 = new City("Shangai",true);
		City city222 = new City("ghnahai",false);
		City city223 = new City("qingme",false);
		City city224 = new City("chinglo",true);
		List<City> cities4 = new ArrayList<City>();
		cities4.add(city221);cities4.add(city222);cities4.add(city223);
		cities4.add(city224);
		
		
		Map<State, List<City>> one1 = new HashMap<>();
		one1.put(state2, cities3);
		one1.put(state3, cities4);
		
		//us 
		
		State state4 = new State();
		state4.setArea(576459645);
		state4.setStateName("kentucky");
		City city311 = new City("newyork",true);
		City city312 = new City("Chicago",false);
		City city313 = new City("seatle",false);
		City city314 = new City("leema",true);
		List<City> cities5 = new ArrayList<City>();
		cities5.add(city311);cities5.add(city312);cities5.add(city313);
		cities5.add(city314);
		
		State state5 = new State();
		state5.setArea(32568595);
		state5.setStateName("North califonia");
		City city321 = new City("Montan",true);
		City city322 = new City("whisper",false);
		City city323 = new City("California",false);
		City city324 = new City("Los Angles",false);
		List<City> cities6 = new ArrayList<City>();
		cities6.add(city321);cities6.add(city322);cities6.add(city323);
		cities6.add(city324);
		
		
		Map<State, List<City>> one3 = new HashMap<>();
		one1.put(state4, cities5);
		one1.put(state5, cities6);
		countries.put(country, one);
		countries.put(country1, one1);
		countries.put(country2, one3);
		System.out.println(countries);
		Set<Entry<Country,Map<State,List<City>>>> jim = countries.entrySet();
		Iterator<Entry<Country,Map<State,List<City>>>> item = jim.iterator();
		
		while (item.hasNext()) {
			Entry<Country,Map<State,List<City>>> first = item.next();
			System.out.print(first.getKey().getName()+" "+ first.getKey().getArea()+" "+first.getKey().getPopulation());
			Set<Entry<State,List<City>>> lee = first.getValue().entrySet();
			
			Iterator<Entry<State,List<City>>> itol = lee.iterator();
			while (itol.hasNext()) {
				Entry<State,List<City>> sec = itol.next();
				System.out.println(" key is "+sec.getKey().getStateName());
				List<City> cio = sec.getValue();
				for (City c : cio) {
					System.out.print(c.getCityName()+" is capital ? ");
					String ss = c.isCapital()?"Yes it is ":"No it is not ";
					System.out.println(ss);
					}
			}
			
			
			
			
		}
		
	}

}
