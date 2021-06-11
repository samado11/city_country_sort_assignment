/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

/**
 *
 * @author maroa
 */
public class City {
    private String name;
    private String id;
    private String country_id;
    private int population;
    public City(String id,String name,String country_id,int population) {
        this.id = id;
        this.name = name;
        this.country_id = country_id;
        this.population = population;
  }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getCountry_id() {
        return country_id;
    }

    public int getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return "City{" + "name=" + name + ", id=" + id + ", country_id=" + country_id + ", population=" + population + '}';
    }
    
    
    
}
