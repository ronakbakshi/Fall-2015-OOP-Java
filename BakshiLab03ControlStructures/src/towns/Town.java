/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towns;

/**
 *Contains town class with 2 constructors and 2 getter methods to compute density and first highest year
 * @author Ronak Bakshi
 */
public class Town {
    private String name;
    private long population;
    private double area;
    private long POPULATION = 10581;
    private double AREA = 13;
    
    /**
     * 3 argument constructor
     * @param name
     * @param population
     * @param area 
     */
    public Town(String name, long population, double area)
    {
        this.name = name;
        this.population = population;
        this.area = area;
    }
    /**
     * No argument constructor
     */
    public Town()
    {
        name = "Maryville";
        population = POPULATION;
        area = AREA;
    }
    /**
     * to return a string with 10 years of density range
     * @return density range
     */
    public String getDensity()
    {
        String temp;
        long populationYear = population;
        double areaYear = area;
        double density;
        double rate;
        rate = 0.008;
        temp = "";
        density = 0;
        for(int year=2006; year < 2016; year++)
        {
            populationYear +=  populationYear*rate;
            density = populationYear/areaYear;
            
            if(density <= 830)
            {
                temp += "\nThe population density will be under control in " +(year+1);
            }
            else if(density > 830 && density <= 840)
            {
                temp += "\nThe population density will be moderately high in " +(year+1);
            }
            else if(density > 840 && density <= 860)
            {
                temp += "\nThe population density will be high in " +(year+1);
            }
            else if(density > 860)
            {
                temp += "\nThe population density will be extremely high in " +(year+1);
            }
        }
        return temp;
    }
    /**
     * returns the first year with density above 860 
     * @return year with highest density
     */
    public int getFirstHighestYear()
    {
        double density;
        double rate;
        rate = 0.008;
        density = 0;
        int year = 2006;
        int newYear = 0;
        double areaYear = area;
        double populationYear = population;
        density = populationYear/areaYear;
        if(density > 860)
        {
            return year;
        }
        else
        {
            year++;
            while(year<2016)
            {   
                populationYear +=  populationYear*rate;
                density = populationYear/areaYear;
                if(density > 860)
                {
                    newYear = year;
                    break;
                }
                else
                {
                    year++;
                }
            }   
            return newYear;
        }
    }
}
