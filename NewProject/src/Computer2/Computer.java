package Computer2;

import java.util.Scanner;

public class Computer {
    protected int processor;
    protected int ram;
    protected int hdd;
    protected  boolean powerONOFF =false;
    protected int work;

    public Computer(int processor, int ram, int hdd) {
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
        this.powerONOFF =false;
        this.work = work;

    }

    public void setPowerONOFF(boolean powerONOFF) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to enable");
        for (int i = 0; i <= 1; i++) {
            i = (int) ((Math.random() * 2));
            sc.nextInt();
            if (i < 1) {
                System.out.println("On");
                break;
            } else {
                System.out.println("Your computer burned down you entered the wrong number");
            }
        }
        System.out.println("Enter a number to turn off");
        for (int i = 0; i <= 1; i++) {
            i = (int) ((Math.random() * 2));
            sc.nextInt();
            if (i < 1) {
                System.out.println("off");
                break;
            } else {
                System.out.println("Your computer burned down you entered the wrong number");
            }
        }
    }

    public boolean iswork() {
        for (int i = 0; i <= processor; i++) {
            i = (int) ((Math.random() * 4500));
            if(i<=processor) {
                System.out.println(i + " " + "The system is fine");
            }else{
                System.out.println(i + " " +"Your computer burned down due to system overload");
            }
            for (int j = 0; j <= ram; j++) {
                j = (int) ((Math.random() * 10000));
                if(j<=ram) {
                    System.out.println(j + " " + "The system is fine");
                }else{
                    System.out.println(j + " " +"Your computer burned down due to system overload");
                }
                for (int k = 0; k <= hdd; k++) {
                    k = (int) ((Math.random() * 600));
                    if(k<=hdd) {
                        System.out.println(k + " " + "The system is fine");
                    }else{
                        System.out.println(k + " " +"Your computer burned down due to system overload");
                        break;
                    }

                }
            }
        }
        return false;
    }

}



