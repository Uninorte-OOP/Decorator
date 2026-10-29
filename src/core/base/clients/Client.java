/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.base.clients;

import core.base.components.Component;

/**
 *
 * @author edangulo
 */
public class Client {
    
    private Component component;

    public Client(Component component) {
        this.component = component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }
    
    public void executeOperation() {
        System.out.println(component.operation());
    }
    
}
