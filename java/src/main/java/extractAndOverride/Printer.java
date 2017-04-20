package extractAndOverride;

public class Printer {

    public void printHeader() {
        System.out.println("------Header-------");
    }

    public void printBody() {
        printHeader();

        new Terminal().printLine("Message");

        printFooter();
    }

    public void printFooter() {
        System.out.println("------Footer-------");
    }
}