package Transport;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
//       Transport transport = new Transport("Audi, BMW , Boing, Airbus, Scania , МАЗ");
        Passenger passenger = new Passenger();
        Military military = new Military();
        sc.hasNext(passenger.getBrand());
        passenger.setBrand(sc.next());
        sc.hasNext(military.getBrand());
        military.setBrand(sc.next());
//       sc.hasNext(transport.brand);
//       transport.getPower();
//
        System.out.println(passenger.getBrand() + " " + passenger.getPower());
        System.out.println(military.getBrand() + " " + military.getWingspan());


//
////
////       transport.brand.setPower(105);
////       transport.setMaxSpeed(210);
////       transport.setWeightkg(3500);
////
   }
}

