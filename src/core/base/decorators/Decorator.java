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
public abstract class Decorator implements Component {
    
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }
    
    // Default implementation to ensure that all decorators have operation 
    // functionality and return its component operation
    @Override
    public String operation() {
        return component.operation();
    }
    
}
