/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.base.decorators;

import core.base.components.Component;

/**
 *
 * @author edangulo
 */
public class ConcreteDecoratorA extends Decorator {
    
    public ConcreteDecoratorA(Component component) {
        super(component);
    }
    
    @Override
    public String operation() {
        return super.operation() + " + Decorator A";
    }
    
}
