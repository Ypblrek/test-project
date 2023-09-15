package com.tms.paterny.Fabrica.Factories;

import com.tms.paterny.Fabrica.Developer;
import com.tms.paterny.Fabrica.PythonDeveloper;

public class PythonDeveloperFactory extends DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new PythonDeveloper();
    }
}
