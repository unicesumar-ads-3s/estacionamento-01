/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appestacionamento;

/**
 *
 * @author UniCesumar
 */
public class Funcionarios {
    private Integer id;
    private String name;
    private Integer contaBancaria;
    
    
    Veiculo veiculo = new Veiculo();
    Vaga v = new Vaga(); 

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the contaBancaria
     */
    public Integer getContaBancaria() {
        return contaBancaria;
    }

    /**
     * @param contaBancaria the contaBancaria to set
     */
    public void setContaBancaria(Integer contaBancaria) {
        this.contaBancaria = contaBancaria;
    }
    
    public void guardarCarro(String placa, Integer vaga) {
        if (veiculo.getPermanencia() == false) {
            veiculo.setPermanencia(true);
            v.setLivre(false);
        } else {
            veiculo.setPermanencia(false);
            v.setLivre(true);
        }
    }
    
}
