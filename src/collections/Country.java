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
public class Country {
    private String name;
    private String code;
    public Country(String code,String name) {
        this.code = code;
        this.name = name;
  }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }
    
}
