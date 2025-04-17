package org.example.builerpattern.proiect2;

public class Main {
    public static void main(String[] args) {
        Computer computer = new ComputerBuider()
                .setProcessor("Intel Core i7")
                .setRam("16GB")
                .setStorage("SSD")
                //.setGraphicsCard("NVIDIA RTX 3090")
                .setMotherboard("ASUS ROG B550-4G")
                .setPowerSupply("Power Supply 5V 2A")
                .setCaseType("Gaming Case")
                .build();
        System.out.println(computer);
    }
}
