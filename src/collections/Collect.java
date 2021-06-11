/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author maroa
 */
public class Collect {


    public HashMap<String, ArrayList> read_csv(){

ArrayList<City> cities_list = new ArrayList<City>();

ArrayList<Country> country_list = new ArrayList<Country>();
HashMap<String, ArrayList> capitalCities = new HashMap<String, ArrayList>();
        try{
        File cities = new File("C:\\Data\\ITI\\Java\\cities.csv");
        Scanner myReader = new Scanner(cities);
        File countries = new File("C:\\Data\\ITI\\Java\\countries.csv");
        Scanner myReader1 = new Scanner(countries);
        
        while(myReader.hasNextLine()){
            
            String data = myReader.nextLine();
            String[] attributes = data.split(",");
            if(attributes.length>4 && attributes[4].matches("[0-9]+") ){
            City city = new City(attributes[0],attributes[1],attributes[2],Integer.parseInt(attributes[4]));
            cities_list.add(city);
            Collections.sort(cities_list,Comparator.comparing(City::getPopulation));
            Collections.reverse(cities_list);
            }
            String data1 = myReader1.nextLine();
            String[] attributes1 = data1.split(",");
            Country country = new Country(attributes1[1],attributes1[0]);
            country_list.add(country);
//            System.out.println(attributes1[1]);
        }
        for(int i=0;i<country_list.size();i++){
            ArrayList<City> cities_country_list = new ArrayList<City>();
            for(int j=0;j<cities_list.size();j++){
                
                if(country_list.get(i).getCode().equals(cities_list.get(j).getCountry_id())){
//                    System.out.println(country_list.get(i).getCode()+"  "+cities_list.get(j).getCountry_id());
                    cities_country_list.add(cities_list.get(j));
                    
  
                }
            }
            capitalCities.put(country_list.get(i).getName(), cities_country_list);
        }
        myReader.close();
        }
        catch (FileNotFoundException e){
            
        }
        return capitalCities;
    }
    public static void main(String[] args) {
        Collect obj = new Collect();
        HashMap<String, ArrayList> capitalCities = new HashMap<String, ArrayList>();
        capitalCities=obj.read_csv();
        capitalCities.forEach((k,v)-> System.out.println("Country= "+k+" , City= "+v));
        
    
    }
    
    
}
