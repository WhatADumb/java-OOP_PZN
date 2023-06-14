package firmansyah.java.app;

import static firmansyah.java.data.Application.PROCESSORS;
import static firmansyah.java.data.Constant.*;
import firmansyah.java.data.Country;
import firmansyah.java.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        //Static Field
        System.out.println(APPLICATION);
        System.out.println(VERSION);

        //Static Method
        System.out.println(MathUtil.mathSum(1,2,3,4,5));

        //Static InnerClass
        Country.City city = new Country.City();
        city.setName("Alabama");
        System.out.println(city.getName());

        //Static Block Code
        System.out.println(PROCESSORS);
    }
}
