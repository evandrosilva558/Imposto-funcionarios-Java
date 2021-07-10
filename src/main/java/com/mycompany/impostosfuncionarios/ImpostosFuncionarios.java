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
public class ImpostosFuncionarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Funcionarios gerente = new Funcionarios();
        Funcionarios supervisor = new Funcionarios();
        Funcionarios atendente = new Funcionarios();
        
        atendente.setNome("Carol");
        atendente.setCargo("Atendente");
        atendente.setIdade(22);
        atendente.setImposto(2000);
        
        supervisor.setNome("Fernando");
        supervisor.setCargo("Supervisor");
        supervisor.setIdade(32);
        supervisor.setImposto(5000);
        
        gerente.setNome("Gabriel");
        gerente.setCargo("Gerente");
        gerente.setIdade(35); 
        gerente.setImposto(10000);
        
        System.out.println("Nome: "+atendente.getNome()+"\n"+"Idade: "+atendente.getIdade()+
            "\n"+"Cargo: "+atendente.getCargo()+"\n"+"Imposto: "+atendente.calculaImposto()+" Por mês"+"\n");
        
        System.out.println("Nome: "+supervisor.getNome()+"\n"+"Idade: "+supervisor.getIdade()+
            "\n"+"Cargo: "+supervisor.getCargo()+"\n"+"Imposto: "+supervisor.calculaImposto()+" Por mês"+"\n");
        
        System.out.println("Nome: "+gerente.getNome()+"\n"+"Idade: "+gerente.getIdade()+
            "\n"+"Cargo: "+gerente.getCargo()+"\n"+"Imposto: "+gerente.calculaImposto()+" Por mês");
    }
    
}
