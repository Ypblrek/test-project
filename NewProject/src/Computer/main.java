package Computer;

public class main {
    public static void main(String[] args) {
        Computer computer = new Computer(1300, 2, 2048, 512);
        Laptop laptop = new Laptop(3200, 4, 4096, 1024, 640);

        System.out.println(computer.info());
        System.out.println(laptop.info());
    }
}
