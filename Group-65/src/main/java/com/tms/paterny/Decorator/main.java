package com.tms.paterny.Decorator;

public class main {
    public static void main(String[] args){
        TeamLead teamLead= new TeamLead (new SeniorDeveloper(new  JuniorDeveloper()));
        teamLead.writeCode();

    }
}
