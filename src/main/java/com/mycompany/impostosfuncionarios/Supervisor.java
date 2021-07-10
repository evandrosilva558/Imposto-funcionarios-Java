/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.impostosfuncionarios;

/**
 *
 * @author Evandro
 */
public class Supervisor extends Funcionarios {
    
    @Override
    public double calculaImposto() {
        return this.getImposto() * 0.05;
    }
    
}
