package com.tms.paterny.AbFabrica.AaFabrica;

import com.tms.paterny.AbFabrica.ffff.Course;
import com.tms.paterny.AbFabrica.ffff.JavaCourse;
import com.tms.paterny.AbFabrica.ffff.JavaLanguage;
import com.tms.paterny.AbFabrica.ffff.Language;
import com.tms.paterny.AbFabrica.ffff.Developer;
import com.tms.paterny.AbFabrica.ffff.JavaDeveloper;

public class JavaFactory extends Factory{
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Language createLanguage() {
        return new JavaLanguage();
    }

    @Override
    public Course cteateCourse() {
        return new JavaCourse();
    }
}
