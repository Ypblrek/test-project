package com.tms.paterny.Facade;

public class main {
    public static void main(String[] args) {
        ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.copyFromDVDtoComputer();

        computerFacade.power.on();

    }
}
