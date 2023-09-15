package com.tms.paterny.AbFabrica;

import com.tms.paterny.AbFabrica.AaFabrica.Factory;
import com.tms.paterny.AbFabrica.AaFabrica.PythonFactory;
import com.tms.paterny.AbFabrica.ffff.Course;
import com.tms.paterny.AbFabrica.ffff.Developer;
import com.tms.paterny.AbFabrica.ffff.Language;

public class Main {
    public static void main(String[] args){
        Factory factory = new PythonFactory();

        Developer developer = factory.createDeveloper();
        Language language = factory.createLanguage();
        Course course = factory.cteateCourse();

        System.out.println(developer.introduction);
        System.out.println(language.Language);
        System.out.println(course.lessons);
    }
}
