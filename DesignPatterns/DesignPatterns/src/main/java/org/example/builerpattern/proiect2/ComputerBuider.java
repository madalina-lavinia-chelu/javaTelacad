package org.example.builerpattern.proiect2;

public class ComputerBuider {
    private String processor;
    private String ram;
    private String storage;
    private String graphicsCard;
    private String motherboard;
    private String powerSupply;
    private String caseType;


    public ComputerBuider setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public ComputerBuider setRam(String ram) {
        this.ram = ram;
        return this;
    }

    public ComputerBuider setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    public ComputerBuider setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
        return this;
    }

    public ComputerBuider setMotherboard(String motherboard) {
        this.motherboard = motherboard;
        return this;

    }

    public ComputerBuider setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
        return this;
    }

    public ComputerBuider setCaseType(String caseType) {
        this.caseType = caseType;
        return this;

    }

    public Computer build(){
        validate();
        return new Computer(processor, ram, storage, graphicsCard, motherboard, powerSupply, caseType);
    }
    private void validate() {
        // exemplu simplu de validare: dacă RAM și placa de bază nu sunt pe același tip (DDR4/DDR5)
        if (ram != null && motherboard != null) {
            if (ram.contains("DDR4") && motherboard.contains("DDR5") ||
                    ram.contains("DDR5") && motherboard.contains("DDR4")) {
                throw new IllegalArgumentException("RAM și placa de bază nu sunt compatibile!");
            }
        }
    }

}
