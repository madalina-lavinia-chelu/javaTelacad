package org.example.builerpattern.proiect3;

public class Main {
    public static void main(String[] args) {

        Computer computer = Computer.builder()
                .processor("Intel Core i7")
                .ram("16GB")
                .storage("SSD")
                .motherboard("ASUS ROG B550-4G")
                .powerSupply("Power Supply 5V 2A")
                .caseType("Gaming Case")
                .build();

        computer.toString();
    }
}
