package com.example.Assignment1.services;

import com.example.Assignment1.models.Cloth;
import com.example.Assignment1.repositories.ClothRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClothService {
    public List<Cloth> getAllClothes() {
        return ClothRepository.getAllClothes();
    }

    public void addCloth(Cloth cloth) {
        ClothRepository.addCloth(cloth);
    }
}
