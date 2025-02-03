package com.example.Assignment1.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cloth {
    private int id;
    private String name;
    private Brand brand;
    private int year;
    private double price;

    public enum Brand {
        BALENCIAGA, STONE_ISLAND, DIOR
    }
}
