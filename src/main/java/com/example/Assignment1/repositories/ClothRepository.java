package com.example.Assignment1.repositories;

import com.example.Assignment1.models.Cloth;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ClothRepository {
    private static List<Cloth> clothes = new ArrayList<>();

    public static List<Cloth> getAllClothes() {
        if (clothes.isEmpty()) {
            clothes.add(Cloth.builder().id(1).name("Shirt").brand(Cloth.Brand.BALENCIAGA).year(2020).price(5000.0).build());
            clothes.add(Cloth.builder().id(2).name("Pants").brand(Cloth.Brand.STONE_ISLAND).year(2021).price(6000.0).build());
            clothes.add(Cloth.builder().id(3).name("Shoes").brand(Cloth.Brand.DIOR).year(2022).price(7000.0).build());
        }
        return clothes;
    }

    public static void addCloth(Cloth cloth) {
        cloth.setId(clothes.size() + 1); // IDを自動インクリメント
        clothes.add(cloth);
    }
}
