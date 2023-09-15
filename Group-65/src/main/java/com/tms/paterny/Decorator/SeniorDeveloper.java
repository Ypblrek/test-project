package com.tms.paterny.Decorator;

public class SeniorDeveloper extends DeveloperDecorator{
    public SeniorDeveloper(IDeveloper iDeveloper) {
        super(iDeveloper);
    }

    @Override
    void writeCode() {
        super.writeCode();
        System.out.println("Testing code ...");
    }

}
