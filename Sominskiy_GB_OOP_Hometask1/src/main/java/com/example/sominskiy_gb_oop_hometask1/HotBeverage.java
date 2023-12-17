package com.example.sominskiy_gb_oop_hometask1;

class HotBeverage extends Beverage {
    private int temperature;

    public HotBeverage(String name, int volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}