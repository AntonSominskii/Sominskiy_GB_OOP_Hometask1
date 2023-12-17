package com.example.sominskiy_gb_oop_hometask1;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SominskiyGbOopHometask1Application {

    public static void main(String[] args) {
        // Инициализация и использование HotBeverage и HotBeverageMachine
        HotBeverageMachine machine = new HotBeverageMachine();
        HotBeverage beverage = (HotBeverage) machine.getProduct("Coffee", 250, 60);

        // Демонстрация использования объекта beverage
        System.out.println("Ordered Beverage: " + beverage.getName());
        System.out.println("Volume: " + beverage.getVolume() + "ml");
        System.out.println("Temperature: " + beverage.getTemperature() + "°C");
    }
}