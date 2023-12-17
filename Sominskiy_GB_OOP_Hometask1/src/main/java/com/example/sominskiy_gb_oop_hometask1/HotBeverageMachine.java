package com.example.sominskiy_gb_oop_hometask1;

class HotBeverageMachine implements VendingMachine {
    @Override
    public Beverage getProduct(String name, int volume, int temperature) {
        return new HotBeverage(name, volume, temperature);
    }
}