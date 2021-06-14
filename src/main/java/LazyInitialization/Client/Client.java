package LazyInitialization.Client;

import LazyInitialization.Singleton.Singleton;

public class Client {
    public static void main(String[] args) {
        Singleton order = Singleton.getOrder("рыба-фугу");
        Singleton anotherOrder = Singleton.getOrder("Карп");
        System.out.println("Ваш заказ: " + order.value);//выведется "рыба-фугу
        System.out.println("Заказ столика 13: " + anotherOrder.value);//выведется "рыба-фугу"
        order.value = "Карп";
        System.out.println("Заказ столика 14: " + order.value);//выведется "Карп"
        System.out.println("Заказ столика 23: " + anotherOrder.value);//выведется "Карп"
    }
}
