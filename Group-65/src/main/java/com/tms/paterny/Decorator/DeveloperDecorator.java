package com.tms.paterny.Decorator;

public class DeveloperDecorator extends  IDeveloper{
    public  IDeveloper iDeveloper;
    public DeveloperDecorator(IDeveloper iDeveloper) {
        this.iDeveloper = iDeveloper;
    }

    @Override
    void writeCode(){
        iDeveloper.writeCode();
    }
}
