package org.example.builerpattern.proiect2;

public class Computer {
    private String processor;
    private String ram;
    private String storage;
    private String graphicsCard;
    private String motherboard;
    private String powerSupply;
    private String caseType;

    Computer(String processor, String ram, String storage, String graphicsCard, String motherboard, String powerSupply, String caseType) {
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.graphicsCard = graphicsCard;
        this.motherboard = motherboard;
        this.powerSupply = powerSupply;
        this.caseType = caseType;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", motherboard='" + motherboard + '\'' +
                ", powerSupply='" + powerSupply + '\'' +
                ", caseType='" + caseType + '\'' +
                '}';
    }
}
