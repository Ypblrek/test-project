package com.tms.paterny.AbFabrica.AaFabrica;

import com.tms.paterny.AbFabrica.ffff.Course;
import com.tms.paterny.AbFabrica.ffff.Language;
import com.tms.paterny.AbFabrica.ffff.Developer;

public abstract class Factory {
    public abstract Developer createDeveloper();
    public abstract Language createLanguage();
    public  abstract Course cteateCourse();

}
