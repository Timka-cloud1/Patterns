package abstractFactory;

import java.util.Scanner;

public class MainAbstractFactory {
    public static void main(String[] args) {
        AbstractFactory abstractFactory;
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        if(line.equals("vintage")) {
            abstractFactory = new VintageFactory();
        } else if(line.equals("modern")){
            abstractFactory = new ModernFactory();
        } else if(line.equals("loft")){
            abstractFactory = new LoftFactory();
        } else {
            throw new IllegalArgumentException();
        }

        Chair chair = abstractFactory.createChair();
        Chair chair1 = abstractFactory.createChair();
        Chair chair2 = abstractFactory.createChair();
        Table table = abstractFactory.createTable();
        Table table1 = abstractFactory.createTable();
        Table table2 = abstractFactory.createTable();
        Table table3 = abstractFactory.createTable();
        System.out.println(chair);
        System.out.println(chair1);
        System.out.println(chair2);
        System.out.println(table);
        System.out.println(table1);
        System.out.println(table2);
        System.out.println(table3);

    }
}
