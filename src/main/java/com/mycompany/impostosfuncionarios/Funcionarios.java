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
public class Funcionarios {
    private String nome;
    private String cargo;
    private int idade;
    private double imposto;
    
    public double calculaImposto() {
        return this.imposto * 0.01;
    }
    
    public double getImposto(){
        return imposto;
    }
    
    public void setImposto(double imposto){
        this.imposto = imposto;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getCargo(){
        return cargo;
    }
    
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
}

