package com.tms.paterny.Decorator;

public class TeamLead extends DeveloperDecorator{
    public TeamLead(IDeveloper iDeveloper) {
        super(iDeveloper);
    }

    @Override
    void writeCode() {
        super.writeCode();
        System.out.println("Can give some advise");
    }
}
