package com.beyondh.three.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RandomService {
    public int[] generateRandomNumber(int count) {
        int[] numbers = new int[count];
        Random random= new Random();
        for(int i =0;i<count;i++){
            numbers[i] = i*2+random.nextInt(2);
        }
        return numbers;
    }
}

