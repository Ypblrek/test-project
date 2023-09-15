package com.tms.paterny.Fabrica;

import com.tms.paterny.Fabrica.Factories.DeveloperFactory;
import com.tms.paterny.Fabrica.Factories.JavaDeveloperFactory;
import com.tms.paterny.Fabrica.Factories.PythonDeveloperFactory;

public class main {
    public static void main(String[] args) {
        DeveloperFactory factory = new PythonDeveloperFactory();
        Developer developer = factory.createDeveloper();

        System.out.println(developer.programLanguage);
        System.out.println(developer.skillList);

    }
}
