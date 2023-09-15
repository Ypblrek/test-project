package com.tms.paterny.AbFabrica.AaFabrica;

import com.tms.paterny.AbFabrica.ffff.Course;
import com.tms.paterny.AbFabrica.ffff.JavaCourse;
import com.tms.paterny.AbFabrica.ffff.Language;
import com.tms.paterny.AbFabrica.ffff.PythonLanguage;
import com.tms.paterny.AbFabrica.ffff.Developer;
import com.tms.paterny.AbFabrica.ffff.PythonDeveloper;

public class PythonFactory extends Factory{
    @Override
    public Developer createDeveloper() {
        return new PythonDeveloper();
    }

    @Override
    public Language createLanguage() {
        return new PythonLanguage();
    }

    @Override
    public Course cteateCourse() {
        return new JavaCourse();
    }
}
