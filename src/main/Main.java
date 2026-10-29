/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import core.base.components.Component;
import core.base.clients.Client;
import core.base.decorators.ConcreteDecoratorA;
import core.base.decorators.ConcreteDecoratorB;
import core.base.implementations.ConcreteComponent;

/**
 *
 * @author edangulo
 */
public class Main {
    
    public static void main(String[] args) {
        Component base = new ConcreteComponent();
        Component aDecorated = new ConcreteDecoratorA(base);
        Component bDecorated = new ConcreteDecoratorB(base);
        Component baDecorated = new ConcreteDecoratorB(aDecorated);
        Component abDecorated = new ConcreteDecoratorA(bDecorated);
        
        Client client = new Client(base);
        client.executeOperation();
        
        client.setComponent(baDecorated);
        client.executeOperation();
        
        client.setComponent(aDecorated);
        client.executeOperation();
        
        client.setComponent(bDecorated);
        client.executeOperation();
        
        client.setComponent(abDecorated);
        client.executeOperation();
    }
    
}
