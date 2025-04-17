package org.example.builerpattern.proiect3;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Computer {
    private String processor;
    private String ram;
    private String storage;
    private String graphicsCard;
    private String motherboard;
    private String powerSupply;
    private String caseType;


}
