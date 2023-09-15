package com.tms.paterny.Facade;

public class ComputerFacade {
    Power power= new Power();
    DVDROM dvdrom= new DVDROM();
    DVDDecoder dvdDecoder= new DVDDecoder();

    public  void  copyFromDVDtoComputer(){
        power.on();
        dvdrom.open();
        dvdrom.close();
        dvdDecoder.copy();
        power.off();
    }
}
