package com.tms.paterny.Fabrica.Factories;

import com.tms.paterny.Fabrica.Developer;
import com.tms.paterny.Fabrica.JavaDeveloper;

public class JavaDeveloperFactory extends DeveloperFactory{

    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
